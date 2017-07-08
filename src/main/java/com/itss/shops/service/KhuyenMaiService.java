package com.itss.shops.service;

import java.util.List;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.dto.KhuyenMaiDTO;

public interface KhuyenMaiService {

    KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);

    KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);

    List<Integer> deleteKhuyenMai(List<Integer> khuyenMaiIDList);

    KhuyenMaiDTO getKhuyenMaiDTOById(Integer khuyenMaiID);

    ListResponse<KhuyenMaiDTO> getKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    Boolean IsExpired(Integer khuyenMaiID);

    ListResponse<KhuyenMaiDTO> getKhuyenMaiAvailable(DonHangDTO donHangDTO);

}
