package com.itss.shops.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.AccountDTO;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.entity.Account;
import com.itss.shops.entity.SanPham;
import com.itss.shops.repository.SanPhamRepository;
import com.itss.shops.repository.predicate.AccountPredicate;
import com.itss.shops.service.SanPhamService;
import com.querydsl.core.types.Predicate;

@Service
public class SanPhamServiceImpl implements SanPhamService {

	@Autowired
	private SanPhamRepository sanPhamRepo;
	
	@Override
	public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {				
			return sanPhamRepo.addSanPham(sanPhamDTO);
		
	}

	@Override
	public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO) {
		// TODO Auto-generated method stub
		//test 2
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
		
		List<SanPhamDTO> listDTO = sanPhamRepo.getSanPham(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
		ListResponse<SanPhamDTO> response = new ListResponse<>();
		response.setList(listDTO);
		response.setTotalCount(Long.valueOf(listDTO.size()));

		return response;
	}

	@Override
	public SanPhamDTO getSanPhamDTOById(Integer sanphamID) {
		return sanPhamRepo.getSanPhamDTOById(sanphamID);
	}
	

}
