package com.itss.shops.repository;

import java.util.List;

import com.itss.shops.dto.NhomSanPhamDTO;

public interface NhomSanPhamRepositoryCustom {
	
	public NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);
	
	public NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);
	
	public List<Integer> deleteNhomSanPham(List<Integer> nhomSanPhamIDList);
	
	public NhomSanPhamDTO getNhomSanPhamByID(Integer nhomSanPhamID) throws Exception;
	
	public List<NhomSanPhamDTO> getAll(int pageNum, int pageSize, String sortBy, 
						String sortOrder, Boolean isShowInactive, String searchText);

}
