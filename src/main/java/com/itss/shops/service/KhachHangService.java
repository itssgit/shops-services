package com.itss.shops.service;

import java.util.List;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhachHangDTO;

public interface KhachHangService {

    KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO);

    KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO);

    List<Integer> deleteKhachHang(List<Integer> khachHangIdList);

    KhachHangDTO getKhachHangDTOById(Integer khachHangID);

    ListResponse<KhachHangDTO> getKhachHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    Boolean mergeBan(Integer banParentID, Integer banID);

    Boolean splitBan(Integer banID);

}
