package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;

import java.util.List;

public interface NguyenLieuService {

    NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    List<NguyenLieuDTO> addListNguyenLieu(List<NguyenLieuDTO> nguyenLieuDTOList);

    NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    Integer deleteNguyenLieu(Integer nguyenLieuID);

    List<Integer> deleteListNguyenLieu(List<Integer> listNguyenLieuId);

    ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID);

}
