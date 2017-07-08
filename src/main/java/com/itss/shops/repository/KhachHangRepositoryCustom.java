package com.itss.shops.repository;

import java.util.List;

import com.itss.shops.dto.KhachHangDTO;

public interface KhachHangRepositoryCustom {
	
	public KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO);
	
	public KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO);
	
	public List<Integer> deleteKhachHang(List<Integer> khachHangIdList);
	
	public KhachHangDTO getKhachHangById(Integer khachHangId);
	
	public List<KhachHangDTO> getAll(int pageNum, int pageSize, String sortBy, 
			String sortOrder, Boolean isShowInactive, String searchText);

}
