package com.itss.shops.service;

import java.util.Optional;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.SanPhamDTO;

public interface SanPhamService {
	
	SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO);
	
	SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO);
	
	Integer deleteSanPham(Integer sanphamID);
	
	ListResponse<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);
	
	Optional<SanPhamDTO> getSanPhamDTOById(Integer sanphamID);

}
