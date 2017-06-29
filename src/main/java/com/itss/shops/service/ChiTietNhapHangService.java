package com.itss.shops.service;

import com.itss.shops.dto.ChiTietNhapHangDTO;

import java.util.List;

public interface ChiTietNhapHangService {

    ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    ChiTietNhapHangDTO updateChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    Integer deleteChiTietNhapHang(Integer chiTietNhapHangID);

    ChiTietNhapHangDTO getChiTietNhapHangDTOById(Integer chiTietNhapHangID);

    List<ChiTietNhapHangDTO> getChiTietNhapHangDtosByPhieuNhapId(Integer phieuNhapId);

}
