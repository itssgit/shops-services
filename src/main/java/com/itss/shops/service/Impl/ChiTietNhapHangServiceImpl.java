package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.repository.ChiTietNhapHangRepository;
import com.itss.shops.service.ChiTietNhapHangService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChiTietNhapHangServiceImpl implements ChiTietNhapHangService {

    @Autowired
    private ChiTietNhapHangRepository chiTietNhapHangRepository;

    @Override
    public ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO) {
        if (chiTietNhapHangDTO.getChiTietNhapHangId() == null || chiTietNhapHangDTO.getChiTietNhapHangId() == 0) {
            chiTietNhapHangDTO.setChiTietNhapHangId(null);
            return chiTietNhapHangRepository.addChiTietNhapHang(chiTietNhapHangDTO);
        } else throw new BadRequestException();
    }

    @Override
    public List<ChiTietNhapHangDTO> addListChiTietNhapHang(List<ChiTietNhapHangDTO> listChiTietNhapHangDTO, Integer phieuNhapId) {
        List<ChiTietNhapHangDTO> result = new ArrayList<>();

        for (ChiTietNhapHangDTO tmpDTO : listChiTietNhapHangDTO) {
            tmpDTO.setPhieuNhapId(phieuNhapId);
            ChiTietNhapHangDTO addedDTO = this.addChiTietNhapHang(tmpDTO);
            if (addedDTO.getChiTietNhapHangId() != null) {
                result.add(addedDTO);
            }
        }

        return result;
    }

    @Override
    public ChiTietNhapHangDTO updateChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO) {
        if (chiTietNhapHangDTO.getChiTietNhapHangId() != null) {
            return chiTietNhapHangRepository.updateChiTietNhapHang(chiTietNhapHangDTO);
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    @Transactional
    public List<ChiTietNhapHangDTO> updateListChiTietNhapHang(List<ChiTietNhapHangDTO> chiTietNhapHangDTOs) {
        List<ChiTietNhapHangDTO> listDTO = new ArrayList<>();
        for (ChiTietNhapHangDTO tmpDTO : chiTietNhapHangDTOs) {

            ChiTietNhapHangDTO updatedDTO = this.updateChiTietNhapHang(tmpDTO);
            listDTO.add(updatedDTO);
        }
        return listDTO;
    }

    @Override
    public Integer deleteChiTietNhapHang(Integer chiTietNhapHangID) {
        return chiTietNhapHangRepository.deleteChiTietNhapHang(chiTietNhapHangID);
    }

    @Override
    @Transactional
    public Integer deleteChiTietNhapHangByPhieuNhapID(Integer phieuNhapID) {
        List<ChiTietNhapHangDTO> chiTietNhapHangDTOList = this.getChiTietNhapHangDtosByPhieuNhapId(phieuNhapID);
        if (chiTietNhapHangDTOList != null) {
            for (ChiTietNhapHangDTO tmpDTO : chiTietNhapHangDTOList) {
                this.deleteChiTietNhapHang(tmpDTO.getChiTietNhapHangId());
            }
        }
        return chiTietNhapHangDTOList != null ? chiTietNhapHangDTOList.size() : 0;
    }

    @Override
    public ChiTietNhapHangDTO getChiTietNhapHangDTOById(Integer chiTietNhapHangID) {
        return chiTietNhapHangRepository.getChiTietNhapHangDTOById(chiTietNhapHangID);
    }

    @Override
    public List<ChiTietNhapHangDTO> getChiTietNhapHangDtosByPhieuNhapId(Integer phieuNhapId) {
        return chiTietNhapHangRepository.getChiTietNhapHangDtosByPhieuNhapId(phieuNhapId);
    }
}
