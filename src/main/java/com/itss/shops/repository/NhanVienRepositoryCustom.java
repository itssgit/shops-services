package com.itss.shops.repository;

import java.util.List;

import com.itss.shops.dto.NhanVienDTO;

public interface NhanVienRepositoryCustom {
	
	public NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO);
	
	public NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO);
	
	public List<Integer> deleteNhanVien(List<Integer> nhanVienIDList);
	
	public NhanVienDTO getNhanVienByID(Integer nhanVienID);
	
	public List<NhanVienDTO> getAll(int pageNum, int pageSize, String sortBy, 
						String sortOrder, Boolean isShowInactive, String searchText);

}
