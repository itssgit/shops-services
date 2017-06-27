package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.HangKhuyenMaiDTO;

import java.util.Optional;

public interface HangKhuyenMaiService {

    HangKhuyenMaiDTO addHangKhuyenMai(HangKhuyenMaiDTO hangHangKhuyenMaiDTO);

    HangKhuyenMaiDTO updateHangKhuyenMai(HangKhuyenMaiDTO hangHangKhuyenMaiDTO);

    Integer deleteHangKhuyenMai(Integer hangHangKhuyenMaiID);

    Optional<HangKhuyenMaiDTO> getHangKhuyenMaiDTOById(Integer hangHangKhuyenMaiID);

    ListResponse<HangKhuyenMaiDTO> getHangKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);


}
