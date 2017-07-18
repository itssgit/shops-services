package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.repository.SanPhamRepository;
import com.itss.shops.service.ChiTietSanPhamService;
import com.itss.shops.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.itss.shops.common.constant.Constants.DATA_DIR;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepo;

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    String dataDir = DATA_DIR;

    @Value("server.dataDir")
    String displayDir;


    private String convertImgBase64(String sourceData, Integer sanPhamId) {
        String fileName =  sanPhamId + "_" + System.currentTimeMillis() + ".png";
        String pathName = dataDir + fileName;
        String displayPath = displayDir + fileName;
        String[] split = sourceData.split(",");
        String imageString = split[1];
        // create a buffered image
        BufferedImage image = null;
        byte[] imageByte;

        BASE64Decoder decoder = new BASE64Decoder();
        try {
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
            File outputfile = new File(pathName);
            ImageIO.write(image, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RestException("Invalid image!");
        }

        return displayPath;
    }

    @Override
    @Transactional
    public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
        if (sanPhamDTO.getSanPhamId() == null || sanPhamDTO.getSanPhamId() == 0) {
            sanPhamDTO.setSanPhamId(null);

            SanPhamDTO resultDTO = sanPhamRepo.addSanPham(sanPhamDTO);

            //convert imgBase64 to image
            resultDTO.setHinhAnh(convertImgBase64(sanPhamDTO.getImgBase64(),resultDTO.getSanPhamId()));
            resultDTO = sanPhamRepo.updateSanPham(resultDTO);


            List<ChiTietSanPhamDTO> chiTietSanPhamDTOList =
                    chiTietSanPhamService.addListChiTietSanPham(sanPhamDTO.getChiTietSanPhamDTOList(), resultDTO.getSanPhamId());

            resultDTO.setChiTietSanPhamDTOList(chiTietSanPhamDTOList);

            return resultDTO;
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO) {
        if (sanPhamDTO.getSanPhamId() != null) {
            //delete chi tiet khong co trong list
            List<ChiTietSanPhamDTO> chiTietSanPhamDTOs = chiTietSanPhamService.getListChiTietSanPhamDTOBySanPhamId(sanPhamDTO.getSanPhamId());
            //List<ChiTietSanPhamDTO> listDelete = new ArrayList<>();
            chiTietSanPhamDTOs.forEach(chiTietSanPhamDTO -> {
                Boolean isDelete = true;
                for(ChiTietSanPhamDTO tmpDTO : sanPhamDTO.getChiTietSanPhamDTOList()){
                    if(chiTietSanPhamDTO.getChiTietSanPhamId() == tmpDTO.getChiTietSanPhamId()
                            && chiTietSanPhamDTO.getChiTietSanPhamId() != null
                            && chiTietSanPhamDTO.getChiTietSanPhamId() != 0 ){
                        isDelete = false;
                        break;
                    }
                }

                if(isDelete) {
                    if (chiTietSanPhamDTO.getChiTietSanPhamId() != null && chiTietSanPhamDTO.getChiTietSanPhamId() != 0)
                        chiTietSanPhamService.deleteChiTietSanPham(chiTietSanPhamDTO.getChiTietSanPhamId());
                }
            });

            //add or update chi tiet co trong list
            chiTietSanPhamService.updateListChiTietSanPham(sanPhamDTO.getChiTietSanPhamDTOList());
            return sanPhamRepo.updateSanPham(sanPhamDTO);
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public Integer deleteSanPham(Integer sanphamID) {
        chiTietSanPhamService.deleteChiTietSanPhamBySanPhamID(sanphamID);
        return sanPhamRepo.deleteSanPhamById(sanphamID);
    }

    @Override
    public List<Integer> deleteListSanPham(List<Integer> listSanPhamId) {
        List<Integer> result = new ArrayList<>();

        listSanPhamId.forEach(i -> {
            try {
                this.deleteSanPham(i);
                result.add(i);
            } catch (Exception ex) {
                //ghi log
            }
        });

        return result;
    }

    @Override
    public ListResponse<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder,
                                               Boolean isShowInactive, String searchText) {

        List<SanPhamDTO> listDTO = sanPhamRepo.getSanPham(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        if (!listDTO.isEmpty()) {
            for (SanPhamDTO tmpDTO : listDTO) {
                tmpDTO.setChiTietSanPhamDTOList(chiTietSanPhamService.getListChiTietSanPhamDTOBySanPhamId(tmpDTO.getSanPhamId()));
            }
        }

        ListResponse<SanPhamDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount(Long.valueOf(listDTO.size()));

        return response;
    }


    @Override
    public SanPhamDTO getSanPhamDTOById(Integer sanphamID) {
        SanPhamDTO resultDTO = sanPhamRepo.getSanPhamDTOById(sanphamID);
        resultDTO.setChiTietSanPhamDTOList(chiTietSanPhamService.getListChiTietSanPhamDTOBySanPhamId(sanphamID));
        return resultDTO;
    }


}
