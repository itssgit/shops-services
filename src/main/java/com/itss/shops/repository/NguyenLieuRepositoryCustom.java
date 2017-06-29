package com.itss.shops.repository;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;

/**
 * Created by hungdd-cadpro on 29/06/2017.
 */
public interface NguyenLieuRepositoryCustom {

    NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    Integer deleteNguyenLieu(Integer nguyenLieuID);

    NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID);

    ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}

