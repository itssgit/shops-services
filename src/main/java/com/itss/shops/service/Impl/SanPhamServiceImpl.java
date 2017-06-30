package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.repository.SanPhamRepository;
import com.itss.shops.service.ChiTietSanPhamService;
import com.itss.shops.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepo;

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @Override
    @Transactional
    public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
        if (sanPhamDTO.getSanPhamId() == null || sanPhamDTO.getSanPhamId() == 0) {
            sanPhamDTO.setSanPhamId(null);
            SanPhamDTO resultDTO = sanPhamRepo.addSanPham(sanPhamDTO);

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
