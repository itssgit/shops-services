package com.itss.shops.service;

import com.itss.shops.dto.PhieuNhapDTO;

import java.util.List;

public interface PhieuNhapService {

    PhieuNhapDTO addPhieuNhap(PhieuNhapDTO phieuNhapDTO);

    PhieuNhapDTO updatePhieuNhap(PhieuNhapDTO phieuNhapDTO);

    Integer deletePhieuNhap(Integer phieuNhapID);

    PhieuNhapDTO getPhieuNhapDTOById(Integer phieuNhapID);

    List<PhieuNhapDTO> getPhieuNhap(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
