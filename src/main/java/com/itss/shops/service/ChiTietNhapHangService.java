package com.itss.shops.service;

import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.dto.ChiTietNhapHangDTO;

import java.util.List;

public interface ChiTietNhapHangService {

    ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    List<ChiTietNhapHangDTO> addListChiTietNhapHang(List<ChiTietNhapHangDTO> listChiTietNhapHangDTO, Integer phieuNhapId);

    ChiTietNhapHangDTO updateChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO);

    List<ChiTietNhapHangDTO> updateListChiTietNhapHang(List<ChiTietNhapHangDTO> chiTietNhapHangDTOs);

    Integer deleteChiTietNhapHang(Integer chiTietNhapHangID);

    Integer deleteChiTietNhapHangByPhieuNhapID(Integer phieuNhapID);

    ChiTietNhapHangDTO getChiTietNhapHangDTOById(Integer chiTietNhapHangID);

    List<ChiTietNhapHangDTO> getChiTietNhapHangDtosByPhieuNhapId(Integer phieuNhapId);

}
