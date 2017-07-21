package com.itss.shops.service;

import com.itss.shops.dto.ChiTietDonHangDTO;

import java.util.List;

public interface ChiTietDonHangService {

    ChiTietDonHangDTO addChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO);

    List<ChiTietDonHangDTO> addListChiTietDonHang(List<ChiTietDonHangDTO> listChiTietDonHangDTO, Integer donHangId);

    ChiTietDonHangDTO updateChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO);

    List<ChiTietDonHangDTO> updateListChiTietDonHang(List<ChiTietDonHangDTO> chiTietDonHangDTOs);

    Integer deleteChiTietDonHang(Integer chiTietDonHangID);

    Integer deleteChiTietDonHangByDonHangID(Integer donHangID);

    List<ChiTietDonHangDTO> getListChiTietDonHangDTOByDonHangId(Integer donHangID);

    ChiTietDonHangDTO getChiTietDonHangDTOById(Integer chiTietDonHangID);

}
