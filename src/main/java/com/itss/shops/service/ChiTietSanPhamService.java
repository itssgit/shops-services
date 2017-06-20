package com.itss.shops.service;

import java.util.List;
import java.util.Optional;

import com.itss.shops.dto.ChiTietSanPhamDTO;;

public interface ChiTietSanPhamService {
	

	ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);
	
	ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);
	
	Integer deleteChiTietSanPham(Integer chiTietSanPhamID);
	
	List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID);
	
	Optional<ChiTietSanPhamDTO> getChiTietSanPhamDTOById(Integer chiTietSanPhamID);
}
