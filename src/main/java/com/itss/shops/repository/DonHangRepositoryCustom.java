package com.itss.shops.repository;

import com.itss.shops.dto.DonHangDTO;

import java.util.List;

public interface DonHangRepositoryCustom {

    DonHangDTO addDonHang(DonHangDTO donHangDTO);

    DonHangDTO updateDonHang(DonHangDTO donHangDTO);

    Integer deleteDonHang(Integer donhangID);

    DonHangDTO getDonHangDTOById(Integer donhangID);

    List<DonHangDTO> getDonHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
