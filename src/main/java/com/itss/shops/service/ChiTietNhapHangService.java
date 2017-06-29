package com.itss.shops.service;

import java.util.Optional;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.AccountDTO;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.entity.Account;
import com.itss.shops.vo.request.AccountRequestVo;
import com.itss.shops.vo.response.AccountResponse;

public interface ChiTietNhapHangService {

    NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO);

    Integer deleteNguyenLieu(Integer nguyenLieuID);

    NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID);

    ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);


}
