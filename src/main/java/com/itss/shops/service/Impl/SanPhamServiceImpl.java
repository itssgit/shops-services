package com.itss.shops.service.Impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService {

	@Override
	public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteSanPham(Integer sanphamID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListResponse<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder,
			Boolean isShowInactive, String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SanPhamDTO> getSanPhamDTOById(Integer sanphamID) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
