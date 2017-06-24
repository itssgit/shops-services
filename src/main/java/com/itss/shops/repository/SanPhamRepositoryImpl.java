package com.itss.shops.repository;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.itss.shops.common.constant.Errors;
import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.entity.SanPham;
import com.itss.shops.repository.predicate.SanPhamPredicate;
import com.querydsl.core.types.Predicate;

public class SanPhamRepositoryImpl implements SanPhamRepositoryCustom {

	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
		SanPham sanPham = modelMapper.map(sanPhamDTO, SanPham.class);
		try {		
			sanPhamRepository.saveAndFlush(sanPham);

		} catch (Exception ex) {			
			throw new RestException(Errors.ERROR_CODE_DB, Errors.ERROR_CODE_DB_MSG);
		}		
		return modelMapper.map(sanPham, SanPhamDTO.class);
	}


	@Override
	public List<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder,
			Boolean isShowInactive, String searchText) {
		PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
		Predicate where = SanPhamPredicate.findSanPham(searchText, isShowInactive);
		Page<SanPham> pageSanPham = sanPhamRepository.findAll(where, pageRequest);

		List<SanPham> listSanPham = pageSanPham.getContent();
		List<SanPhamDTO> result = new ArrayList<>();
		if (pageSanPham.getTotalElements() > 0) {
			for (SanPham sanPham : listSanPham) {
				SanPhamDTO sanPhamDTO = modelMapper.map(sanPham, SanPhamDTO.class);
				result.add(sanPhamDTO);
			}
		}

		return result;
	}


	@Override
	public SanPhamDTO getSanPhamDTOById(Integer sanphamID) {
		SanPhamDTO result = new SanPhamDTO();
		try {
			result = modelMapper.map(sanPhamRepository.findById(sanphamID).orElse(new SanPham()), SanPhamDTO.class);
		} catch (Exception ex) {

		}		
		return result;
	}




}
