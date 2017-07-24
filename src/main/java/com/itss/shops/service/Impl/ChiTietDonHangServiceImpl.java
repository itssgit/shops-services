package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.dto.ChiTietDonHangDTO;
import com.itss.shops.repository.ChiTietDonHangRepository;
import com.itss.shops.service.ChiTietDonHangService;
import com.itss.shops.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {


    @Autowired
    private ChiTietDonHangRepository chiTietDonHangRepository;

    @Autowired
    private SanPhamService sanPhamService;

    @Override
    public ChiTietDonHangDTO addChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO) {
        if (chiTietDonHangDTO.getChiTietDonHangId() == null || chiTietDonHangDTO.getChiTietDonHangId() == 0) {
            chiTietDonHangDTO.setChiTietDonHangId(null);
            return chiTietDonHangRepository.addChiTietDonHang(chiTietDonHangDTO);
        } else throw new BadRequestException();
    }

    @Override
    public List<ChiTietDonHangDTO> addListChiTietDonHang(List<ChiTietDonHangDTO> listChiTietDonHangDTO, Integer donHangId) {
        List<ChiTietDonHangDTO> result = new ArrayList<>();

        for (ChiTietDonHangDTO tmpDTO : listChiTietDonHangDTO) {
            tmpDTO.setDonHangId(donHangId);
            ChiTietDonHangDTO addedDTO = this.addChiTietDonHang(tmpDTO);
            if (addedDTO.getChiTietDonHangId() != null) {
                result.add(addedDTO);
            }
        }

        return result;
    }

    @Override
    public ChiTietDonHangDTO updateChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO) {
        if (chiTietDonHangDTO.getChiTietDonHangId() != null) {
            return chiTietDonHangRepository.updateChiTietDonHang(chiTietDonHangDTO);
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public List<ChiTietDonHangDTO> updateListChiTietDonHang(List<ChiTietDonHangDTO> chiTietDonHangDTOs) {
        List<ChiTietDonHangDTO> listDTO = new ArrayList<>();
        for (ChiTietDonHangDTO tmpDTO : chiTietDonHangDTOs) {

            ChiTietDonHangDTO updatedDTO = this.updateChiTietDonHang(tmpDTO);
            listDTO.add(updatedDTO);
        }
        return listDTO;
    }

    @Override
    public Integer deleteChiTietDonHang(Integer chiTietDonHangID) {
        return chiTietDonHangRepository.deleteChiTietDonHang(chiTietDonHangID);
    }

    @Override
    public Integer deleteChiTietDonHangByDonHangID(Integer donHangID) {
        List<ChiTietDonHangDTO> chiTietDonHangDTOList = this.getListChiTietDonHangDTOByDonHangId(donHangID);
        if (chiTietDonHangDTOList != null) {
            for (ChiTietDonHangDTO tmpDTO : chiTietDonHangDTOList) {
                this.deleteChiTietDonHang(tmpDTO.getChiTietDonHangId());
            }
        }
        return chiTietDonHangDTOList != null ? chiTietDonHangDTOList.size() : 0;
    }

    @Override
    public List<ChiTietDonHangDTO> getListChiTietDonHangDTOByDonHangId(Integer donHangID) {
        List<ChiTietDonHangDTO> chiTietDonHangDTOList = chiTietDonHangRepository.getChiTietDonHangDtosByDonHangId(donHangID);
        for(ChiTietDonHangDTO tmpDTO : chiTietDonHangDTOList){
            tmpDTO.setSanPhamDTO(sanPhamService.getSanPhamDTOById(tmpDTO.getSanPhamId()));
        }

        return chiTietDonHangDTOList;
    }

    @Override
    public ChiTietDonHangDTO getChiTietDonHangDTOById(Integer chiTietDonHangID) {
        ChiTietDonHangDTO chiTietDonHangDTO = chiTietDonHangRepository.getChiTietDonHangDTOById(chiTietDonHangID);
        chiTietDonHangDTO.setSanPhamDTO(sanPhamService.getSanPhamDTOById(chiTietDonHangDTO.getSanPhamId()));
        return chiTietDonHangDTO;
    }
}
