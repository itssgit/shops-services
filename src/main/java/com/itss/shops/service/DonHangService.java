package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;

public interface DonHangService {

    DonHangDTO addDonHang(DonHangDTO donHangDTO);

    DonHangDTO updateDonHang(DonHangDTO donHangDTO);

    Integer deleteDonHang(Integer donhangID);

    DonHangDTO getDonHangDTOById(Integer donhangID);

    ListResponse<DonHangDTO> getDonHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);


}
