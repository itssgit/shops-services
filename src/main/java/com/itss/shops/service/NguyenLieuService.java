package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;

public interface NguyenLieuService {

    NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    Integer deleteNguyenLieu(Integer nguyenLieuID);

    ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID);

}
