package com.itss.shops.repository;

import java.util.List;

import com.itss.shops.dto.KhuyenMaiDTO;

public interface KhuyenMaiRepositoryCustom {
	
	public KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);
	
	public KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO);
	
	public List<Integer> deleteKhuyenMai(List<Integer> khuyenMaiIDList);
	
	public KhuyenMaiDTO getKhuyenMaiByID(Integer khuyenMaiID);
	
	public List<KhuyenMaiDTO> getAll(int pageNum, int pageSize, String sortBy, 
						String sortOrder, Boolean isShowInactive, String searchText);

}
