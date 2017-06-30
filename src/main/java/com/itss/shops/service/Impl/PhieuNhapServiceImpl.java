package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.dto.PhieuNhapDTO;
import com.itss.shops.repository.PhieuNhapRepository;
import com.itss.shops.service.ChiTietNhapHangService;
import com.itss.shops.service.PhieuNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhieuNhapServiceImpl implements PhieuNhapService {

    @Autowired
    private PhieuNhapRepository phieuNhapRepository;

    @Autowired
    private ChiTietNhapHangService chiTietNhapHangService;

    @Override
    @Transactional
    public PhieuNhapDTO addPhieuNhap(PhieuNhapDTO phieuNhapDTO) {
        if (phieuNhapDTO.getPhieuNhapId() == null || phieuNhapDTO.getPhieuNhapId() == 0) {
            phieuNhapDTO.setPhieuNhapId(null);
            PhieuNhapDTO resultDTO = phieuNhapRepository.addPhieuNhap(phieuNhapDTO);

            List<ChiTietNhapHangDTO> chiTietNhapHangDTOList =
                    chiTietNhapHangService.addListChiTietNhapHang(phieuNhapDTO.getChiTietNhapHangDTOList(), resultDTO.getPhieuNhapId());

            resultDTO.setChiTietNhapHangDTOList(chiTietNhapHangDTOList);

            return resultDTO;
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public PhieuNhapDTO updatePhieuNhap(PhieuNhapDTO phieuNhapDTO) {
        if (phieuNhapDTO.getPhieuNhapId() != null) {
            chiTietNhapHangService.updateListChiTietNhapHang(phieuNhapDTO.getChiTietNhapHangDTOList());
            return phieuNhapRepository.updatePhieuNhap(phieuNhapDTO);
        } else throw new BadRequestException();
    }

    @Override
    @Transactional
    public Integer deletePhieuNhap(Integer phieuNhapID) {
        chiTietNhapHangService.deleteChiTietNhapHangByPhieuNhapID(phieuNhapID);
        return phieuNhapRepository.deletePhieuNhap(phieuNhapID);
    }

    @Override
    public PhieuNhapDTO getPhieuNhapDTOById(Integer phieuNhapID) {
        return phieuNhapRepository.getPhieuNhapDTOById(phieuNhapID);
    }

    @Override
    public List<PhieuNhapDTO> getPhieuNhap(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return phieuNhapRepository.getPhieuNhap(pageNum,pageSize,sortBy,sortOrder,isShowInactive,searchText);
    }
}
