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
import com.itss.shops.dto.NhanVienDTO;
import com.itss.shops.entity.NhanVien;
import com.itss.shops.repository.predicate.NhanVienPredicate;
import com.querydsl.core.types.Predicate;

public class NhanVienRepositoryImpl implements NhanVienRepositoryCustom {
	
	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO) {
		// TODO Auto-generated method stub
		NhanVien nhanVien = modelMapper.map(nhanVienDTO, NhanVien.class);
		nhanVienRepository.saveAndFlush(nhanVien);
		return modelMapper.map(nhanVien, NhanVienDTO.class);
	}

	@Override
	public NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO) {
		// TODO Auto-generated method stub
		NhanVien nhanVien = modelMapper.map(nhanVienDTO, NhanVien.class);
		NhanVien nhanVienUpdate = nhanVienRepository.findOne(nhanVienDTO.getNhanVienId());
		if(nhanVienUpdate != null) {
			nhanVienUpdate = nhanVien;
			nhanVienRepository.saveAndFlush(nhanVienUpdate);
		} else {
			throw new RestException("Record doesn't exist");
		}
		
		return modelMapper.map(nhanVienUpdate, NhanVienDTO.class);
	}

	@Override
	public List<Integer> deleteNhanVien(List<Integer> nhanVienIDList) {
		// TODO Auto-generated method stub
		List<Integer> results = new ArrayList<>();
		for(Integer nhanVienID : nhanVienIDList) {
			NhanVien nhanVien = nhanVienRepository.findOne(nhanVienID);
			if(nhanVien != null) {
				nhanVien.setTrangThaiXoa(1);
				nhanVien.setThoiGianXoa(new Date());
				nhanVienRepository.saveAndFlush(nhanVien);
			}
		}
		return results;
	}

	@Override
	public NhanVienDTO getNhanVienByID(Integer nhanVienID) {

		NhanVien nhanVien = nhanVienRepository.findOne(nhanVienID);

		if(nhanVien == null){
			throw new RestException("Record doesn't exist");
		}

		return modelMapper.map(nhanVien, NhanVienDTO.class);
	}

	@Override
	public List<NhanVienDTO> getAll(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive,
			String searchText) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
		Predicate where = NhanVienPredicate.findNhomSanPham(searchText, isShowInactive);
		Page<NhanVien> pageNhanVien = nhanVienRepository.findAll(where, pageRequest);
		
		List<NhanVien> listNhanVien = pageNhanVien.getContent();
		List<NhanVienDTO> results = new ArrayList<>();
		if(pageNhanVien.getTotalElements() > 0) {
			for(NhanVien nhanVien : listNhanVien) {
				NhanVienDTO nhanVienDTO = modelMapper.map(nhanVien, NhanVienDTO.class);
				results.add(nhanVienDTO);
			}
		}
		return results;
	}

}
