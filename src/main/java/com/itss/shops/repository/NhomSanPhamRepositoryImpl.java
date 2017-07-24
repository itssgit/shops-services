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
import com.itss.shops.dto.NhomSanPhamDTO;
import com.itss.shops.entity.NhomSanPham;
import com.itss.shops.repository.predicate.NhomSanPhamPredicate;
import com.querydsl.core.types.Predicate;

public class NhomSanPhamRepositoryImpl implements NhomSanPhamRepositoryCustom{
	
	@Autowired
    private NhomSanPhamRepository nhomSanPhamRepository;

    @Autowired
    private ModelMapper modelMapper;

	@Override
	public NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
		// TODO Auto-generated method stub
		NhomSanPham nhomSanPham = modelMapper.map(nhomSanPhamDTO, NhomSanPham.class);
		nhomSanPhamRepository.saveAndFlush(nhomSanPham);
		return modelMapper.map(nhomSanPham, NhomSanPhamDTO.class);
	}

	@Override
	public NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
		// TODO Auto-generated method stub
		NhomSanPham nhomSanPham = modelMapper.map(nhomSanPhamDTO, NhomSanPham.class);
		NhomSanPham nhomSanPhamUpdate = nhomSanPhamRepository.findOne(nhomSanPhamDTO.getNhomSanPhamId());
		if(nhomSanPhamUpdate != null) {
			nhomSanPhamUpdate = nhomSanPham;
			nhomSanPhamRepository.saveAndFlush(nhomSanPhamUpdate);
		} else {
			throw new RestException("Record doesn't exist");
		}
		return modelMapper.map(nhomSanPhamUpdate, NhomSanPhamDTO.class);
	}

	@Override
	public List<Integer> deleteNhomSanPham(List<Integer> nhomSanPhamIDList) {
		// TODO Auto-generated method stub
		List<Integer> results = new ArrayList<>();
		for(Integer nhomSanPhamID : nhomSanPhamIDList) {
			NhomSanPham nhomSanPham = nhomSanPhamRepository.findOne(nhomSanPhamID);
			if(nhomSanPham != null) {
				nhomSanPham.setTrangThaiXoa(1);
				nhomSanPham.setThoiGianXoa(new Date());
				nhomSanPhamRepository.saveAndFlush(nhomSanPham);
				results.add(nhomSanPhamID);
			}
		}
		return results;
	}

	@Override
	public NhomSanPhamDTO getNhomSanPhamByID(Integer nhomSanPhamID) throws Exception{
		// TODO Auto-generated method stub
		//anhvv - bo sung validate
		NhomSanPham nhomSanPham = nhomSanPhamRepository.findOne(nhomSanPhamID);
		if(nhomSanPham == null){
			throw new Exception("Nhom san pham khong ton tai");
		}
		//end
		return modelMapper.map(nhomSanPhamRepository.findOne(nhomSanPhamID), NhomSanPhamDTO.class);
	}

	@Override
	public List<NhomSanPhamDTO> getAll(int pageNum, int pageSize, String sortBy, String sortOrder,
			Boolean isShowInactive, String searchText) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
		Predicate where = NhomSanPhamPredicate.findNhomSanPham(searchText, isShowInactive);
		Page<NhomSanPham> pageNhomSanPham = nhomSanPhamRepository.findAll(where, pageRequest);
		
		List<NhomSanPham> listNhomSanPham = pageNhomSanPham.getContent();
		List<NhomSanPhamDTO> result = new ArrayList<>();
		if(pageNhomSanPham.getTotalElements() > 0) {
			for(NhomSanPham nhomSanPham : listNhomSanPham) {
				NhomSanPhamDTO nhomSanPhamDTO = modelMapper.map(nhomSanPham, NhomSanPhamDTO.class);
				result.add(nhomSanPhamDTO);
			}
		}
		return result;
	}
    
}
