package com.itss.shops.service.Impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.entity.SanPham;
import com.itss.shops.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService {

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
		SanPham sanPham = modelMapper.map(sanPhamDTO, SanPham.class);
		
		
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
