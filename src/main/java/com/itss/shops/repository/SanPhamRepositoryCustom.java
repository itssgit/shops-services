package com.itss.shops.repository;

import java.util.List;

import com.itss.shops.dto.SanPhamDTO;

public interface SanPhamRepositoryCustom {
	public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO);
	public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO);
	public Integer deleteSanPhamById(Integer sanPhamId);
	public SanPhamDTO getSanPhamDTOById(Integer sanphamID);
	public List<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);	
}
