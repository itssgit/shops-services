package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.repository.ChiTietNhapHangRepository;
import com.itss.shops.service.ChiTietNhapHangService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietNhapHangServiceImpl implements ChiTietNhapHangService {

    @Autowired
    private ChiTietNhapHangRepository chiTietNhapHangRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO) {
        if (chiTietNhapHangDTO.getChiTietNhapHangId() == null || chiTietNhapHangDTO.getChiTietNhapHangId() == 0) {
            chiTietNhapHangDTO.setChiTietNhapHangId(null);
            return chiTietNhapHangRepository.addChiTietNhapHang(chiTietNhapHangDTO);
        } else throw new BadRequestException();
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
    public Integer deleteChiTietNhapHang(Integer chiTietNhapHangID) {
        return chiTietNhapHangRepository.deleteChiTietNhapHang(chiTietNhapHangID);
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
