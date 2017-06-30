package com.itss.shops.repository;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.PhieuNhapDTO;

import java.util.List;

/**
 * Created by hungdd-cadpro on 29/06/2017.
 */
public interface PhieuNhapRepositoryCustom {

    PhieuNhapDTO addPhieuNhap(PhieuNhapDTO phieuNhapDTO);

    PhieuNhapDTO updatePhieuNhap(PhieuNhapDTO phieuNhapDTO);

    Integer deletePhieuNhap(Integer phieuNhapID);

    PhieuNhapDTO getPhieuNhapDTOById(Integer phieuNhapID);

    List<PhieuNhapDTO> getPhieuNhap(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
