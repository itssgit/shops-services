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
import com.itss.shops.dto.KhuyenMaiDTO;
import com.itss.shops.entity.KhuyenMai;
import com.itss.shops.repository.predicate.KhuyenMaiPredicate;
import com.querydsl.core.types.Predicate;

public class KhuyenMaiRepositoryImpl implements KhuyenMaiRepositoryCustom {
	
	@Autowired
	KhuyenMaiRepository khuyenMaiRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
		// TODO Auto-generated method stub
		KhuyenMai khuyenMai = modelMapper.map(khuyenMaiDTO, KhuyenMai.class);
		khuyenMaiRepository.saveAndFlush(khuyenMai);
		return modelMapper.map(khuyenMai, KhuyenMaiDTO.class);
	}

	@Override
	public KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
		// TODO Auto-generated method stub
		KhuyenMai khuyenMai = modelMapper.map(khuyenMaiDTO, KhuyenMai.class);
		KhuyenMai khuyenMaiUpdate = khuyenMaiRepository.findOne(khuyenMaiDTO.getKhuyenMaiId());
		if(khuyenMaiUpdate != null) {
			khuyenMaiUpdate = khuyenMai;
			khuyenMaiRepository.saveAndFlush(khuyenMaiUpdate);
		} else {
			throw new RestException("Record doesn't exist");
		}
		return modelMapper.map(khuyenMaiUpdate, KhuyenMaiDTO.class);
	}

	@Override
	public List<Integer> deleteKhuyenMai(List<Integer> khuyenMaiIDList) {
		// TODO Auto-generated method stub
		List<Integer> results = new ArrayList<>();
		for(Integer khuyenMaiID : khuyenMaiIDList) {
			KhuyenMai khuyenMai = khuyenMaiRepository.findOne(khuyenMaiID);
			if(khuyenMai != null) {
				khuyenMai.setTrangThaiXoa(1);
				khuyenMai.setThoiGianXoa(new Date());
				khuyenMaiRepository.saveAndFlush(khuyenMai);
				results.add(khuyenMaiID);
			}
		}
		return results;
	}

	@Override
	public KhuyenMaiDTO getKhuyenMaiByID(Integer khuyenMaiID) {
		KhuyenMai khuyenMai = khuyenMaiRepository.findOne(khuyenMaiID);

		if(khuyenMai == null){
			throw new RestException("Record doesn't exist");
		}

		return modelMapper.map(khuyenMai, KhuyenMaiDTO.class);
	}

	@Override
	public List<KhuyenMaiDTO> getAll(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive,
			String searchText) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
		Predicate where = KhuyenMaiPredicate.findKhuyenMai(searchText, isShowInactive);
		Page<KhuyenMai> pageKhuyenMai = khuyenMaiRepository.findAll(where, pageRequest);
		
		List<KhuyenMai> listKhuyenMai = pageKhuyenMai.getContent();
		List<KhuyenMaiDTO> result = new ArrayList<>();
		if(pageKhuyenMai.getTotalElements() > 0) {
			for(KhuyenMai khuyenMai : listKhuyenMai) {
				KhuyenMaiDTO khuyenMaiDTO = modelMapper.map(khuyenMai, KhuyenMaiDTO.class);
				result.add(khuyenMaiDTO);
			}
		}
		return result;
	}

}
