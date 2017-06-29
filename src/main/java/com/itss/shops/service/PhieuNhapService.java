package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.PhieuNhapDTO;

public interface PhieuNhapService {

    PhieuNhapDTO addPhieuNhap(PhieuNhapDTO phieuNhapDTO);

    PhieuNhapDTO updatePhieuNhap(PhieuNhapDTO phieuNhapDTO);

    Integer deletePhieuNhap(Integer phieuNhapID);

    PhieuNhapDTO getPhieuNhapDTOById(Integer phieuNhapID);

    ListResponse<PhieuNhapDTO> getPhieuNhap(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
