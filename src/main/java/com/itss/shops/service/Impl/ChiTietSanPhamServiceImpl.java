package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.repository.ChiTietSanPhamRepository;
import com.itss.shops.repository.NguyenLieuRepository;
import com.itss.shops.service.ChiTietSanPhamService;
import com.itss.shops.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private NguyenLieuService nguyenLieuService;

    @Override
    public ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        if (chiTietSanPhamDTO.getChiTietSanPhamId() == null || chiTietSanPhamDTO.getChiTietSanPhamId() == 0) {
            chiTietSanPhamDTO.setChiTietSanPhamId(null);
            return chiTietSanPhamRepository.addChiTietSanPham(chiTietSanPhamDTO);
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public List<ChiTietSanPhamDTO> addListChiTietSanPham(List<ChiTietSanPhamDTO> listChiTietSanPhamDTO, Integer sanPhamId) {
        List<ChiTietSanPhamDTO> result = new ArrayList<>();

        for (ChiTietSanPhamDTO tmpDTO : listChiTietSanPhamDTO) {
            tmpDTO.setSanPhamId(sanPhamId);
            ChiTietSanPhamDTO addedDTO = this.addChiTietSanPham(tmpDTO);
            if (addedDTO.getChiTietSanPhamId() != null) {
                result.add(addedDTO);
            }
        }

        return result;
    }

    @Override
    public ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        if (chiTietSanPhamDTO.getChiTietSanPhamId() != null) {
            return chiTietSanPhamRepository.updateChiTietSanPham(chiTietSanPhamDTO);
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public List<ChiTietSanPhamDTO> updateListChiTietSanPham(List<ChiTietSanPhamDTO> chiTietSanPhamDTOs) {
        List<ChiTietSanPhamDTO> listDTO = new ArrayList<>();
        for (ChiTietSanPhamDTO tmpDTO : chiTietSanPhamDTOs) {
            if (tmpDTO.getChiTietSanPhamId() == null || tmpDTO.getChiTietSanPhamId() == 0) {
                ChiTietSanPhamDTO insertDTO = this.addChiTietSanPham(tmpDTO);
                listDTO.add(insertDTO);
            } else {
                ChiTietSanPhamDTO updatedDTO = this.updateChiTietSanPham(tmpDTO);
                listDTO.add(updatedDTO);
            }
        }
        return listDTO;
    }

    @Override
    public Integer deleteChiTietSanPham(Integer chiTietSanPhamID) {
        return chiTietSanPhamRepository.deleteChiTietSanPhamById(chiTietSanPhamID);
    }

    @Override
    @Transactional
    public Integer deleteChiTietSanPhamBySanPhamID(Integer sanPhamID) {
        List<ChiTietSanPhamDTO> chiTietSanPhamDTOList = this.getListChiTietSanPhamDTOBySanPhamId(sanPhamID);
        if (chiTietSanPhamDTOList != null) {
            for (ChiTietSanPhamDTO tmpDTO : chiTietSanPhamDTOList) {
                this.deleteChiTietSanPham(tmpDTO.getChiTietSanPhamId());
            }
        }
        return chiTietSanPhamDTOList != null ? chiTietSanPhamDTOList.size() : 0;
    }

    @Override
    public List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID) {
        List<ChiTietSanPhamDTO> chiTietSanPhamDTOList = chiTietSanPhamRepository.getListChiTietSanPhamDTOBySanPhamId(sanPhamID);
        chiTietSanPhamDTOList.forEach( chiTietSanPhamDTO -> {
            chiTietSanPhamDTO.setNguyenLieuDTO(nguyenLieuService.getNguyenLieuDTOById(chiTietSanPhamDTO.getNguyenLieuId()));
        });
        return chiTietSanPhamDTOList;
    }

    @Override
    public ChiTietSanPhamDTO getChiTietSanPhamDTOById(Integer chiTietSanPhamID) {
        return chiTietSanPhamRepository.getChiTietSanPhamDTOById(chiTietSanPhamID);
    }


}
