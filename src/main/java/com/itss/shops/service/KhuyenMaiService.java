package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.dto.KhuyenMaiDTO;

import java.util.Optional;

public interface KhuyenMaiService {

    KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);

    KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);

    Integer deleteKhuyenMai(Integer khuyenMaiID);

    Optional<KhuyenMaiDTO> getKhuyenMaiDTOById(Integer khuyenMaiID);

    ListResponse<KhuyenMaiDTO> getKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    Boolean IsExpired(Integer khuyenMaiID);

    ListResponse<KhuyenMaiDTO> getKhuyenMaiAvailable(DonHangDTO donHangDTO);

}
