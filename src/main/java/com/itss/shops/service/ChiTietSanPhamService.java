package com.itss.shops.service;

import java.util.List;
import java.util.Optional;

import com.itss.shops.dto.ChiTietSanPhamDTO;;

public interface ChiTietSanPhamService {
	

	ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

	List<ChiTietSanPhamDTO> addListChiTietSanPham(List<ChiTietSanPhamDTO> listChiTietSanPhamDTO);
	
	ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

	List<ChiTietSanPhamDTO> updateListChiTietSanPham(List<ChiTietSanPhamDTO> chiTietSanPhamDTOs);
	
	Integer deleteChiTietSanPham(Integer chiTietSanPhamID);

	Integer deleteChiTietSanPhamBySanPhamID(Integer sanPhamID);
	
	List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID);
	
	Optional<ChiTietSanPhamDTO> getChiTietSanPhamDTOById(Integer chiTietSanPhamID);
}
