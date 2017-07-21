package com.itss.shops.repository;

import com.itss.shops.dto.ChiTietDonHangDTO;

import java.util.List;

/**
 * Created by hungdd-cadpro on 21/07/2017.
 */
public interface ChiTietDonHangRepositoryCustom {
    ChiTietDonHangDTO addChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO);

    ChiTietDonHangDTO updateChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO);

    Integer deleteChiTietDonHang(Integer chiTietDonHangID);

    ChiTietDonHangDTO getChiTietDonHangDTOById(Integer chiTietDonHangID);

    List<ChiTietDonHangDTO> getChiTietDonHangDtosByDonHangId(Integer donHangId);
}
