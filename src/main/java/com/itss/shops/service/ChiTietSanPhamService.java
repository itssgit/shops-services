package com.itss.shops.service;

import com.itss.shops.dto.ChiTietSanPhamDTO;

import java.util.List;

;

public interface ChiTietSanPhamService {


    ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

    List<ChiTietSanPhamDTO> addListChiTietSanPham(List<ChiTietSanPhamDTO> listChiTietSanPhamDTO, Integer sanPhamId);

    ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

    List<ChiTietSanPhamDTO> updateListChiTietSanPham(List<ChiTietSanPhamDTO> chiTietSanPhamDTOs);

    Integer deleteChiTietSanPham(Integer chiTietSanPhamID);

    Integer deleteChiTietSanPhamBySanPhamID(Integer sanPhamID);

    List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID);

    ChiTietSanPhamDTO getChiTietSanPhamDTOById(Integer chiTietSanPhamID);
}
