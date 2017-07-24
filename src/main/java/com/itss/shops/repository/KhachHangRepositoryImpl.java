package com.itss.shops.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.KhachHangDTO;
import com.itss.shops.entity.KhachHang;
import com.itss.shops.repository.predicate.KhachHangPredicate;
import com.querydsl.core.types.Predicate;

public class KhachHangRepositoryImpl implements KhachHangRepositoryCustom {
	
	@Autowired
	KhachHangRepository khachHangRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO) {
		// TODO Auto-generated method stub
		KhachHang khachHang = modelMapper.map(khachHangDTO, KhachHang.class);
		khachHangRepository.saveAndFlush(khachHang);
		return modelMapper.map(khachHang, KhachHangDTO.class);
	}

	@Override
	public KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO) {
		// TODO Auto-generated method stub
		KhachHang khachHang = modelMapper.map(khachHangDTO, KhachHang.class);
		KhachHang khachHangUpdate = khachHangRepository.findOne(khachHangDTO.getKhachhangId());
		if(khachHangUpdate != null) {
			khachHangUpdate = khachHang;
			khachHangRepository.saveAndFlush(khachHangUpdate);
		} else {
			throw new RestException("Record doesn't exist");
		}
		return modelMapper.map(khachHangUpdate, KhachHangDTO.class);
	}

	@Override
	public List<Integer> deleteKhachHang(List<Integer> khachHangIdList) {
		// TODO Auto-generated method stub
		List<Integer> results = new ArrayList<>();
		for(Integer khachHangId : khachHangIdList) {
			KhachHang khachHang = khachHangRepository.findOne(khachHangId);
			if(khachHang != null) {
				khachHang.setTrangthaiXoa(1);
				khachHang.setThoigianXoa(new Date());
				khachHangRepository.saveAndFlush(khachHang);
				results.add(khachHangId);
			}
		}
		return results;
	}

	@Override
	public KhachHangDTO getKhachHangById(Integer khachHangId) {
		KhachHang khachHang = khachHangRepository.findOne(khachHangId);

		if(khachHang == null){
			throw new RestException("Record doesn't exist");
		}

		return modelMapper.map(khachHang, KhachHangDTO.class);
	}

	@Override
	public List<KhachHangDTO> getAll(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive,
			String searchText) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
		Predicate where = KhachHangPredicate.findKhachHang(searchText, isShowInactive);
		Page<KhachHang> pageKhachHang = khachHangRepository.findAll(where, pageRequest);
		
		List<KhachHang> listKhachHang = pageKhachHang.getContent();
		List<KhachHangDTO> result = new ArrayList<>();
		if(pageKhachHang.getTotalElements() > 0) {
			for(KhachHang khachHang : listKhachHang) {
				KhachHangDTO khachHangDTO = modelMapper.map(khachHang, KhachHangDTO.class);
				result.add(khachHangDTO);
			}
		}
		return result;
	}

}
