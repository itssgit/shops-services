package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhachHangDTO;

import java.util.Optional;

public interface KhachHangService {

    KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO);

    KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO);

    Integer deleteKhachHang(Integer khachHangID);

    Optional<KhachHangDTO> getKhachHangDTOById(Integer khachHangID);

    ListResponse<KhachHangDTO> getKhachHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    Boolean mergeBan(Integer banParentID, Integer banID);

    Boolean splitBan(Integer banID);

}
