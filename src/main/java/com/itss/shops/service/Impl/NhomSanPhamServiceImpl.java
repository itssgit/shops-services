package com.itss.shops.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhomSanPhamDTO;
import com.itss.shops.repository.NhomSanPhamRepository;
import com.itss.shops.service.NhomSanPhamService;

@Service
public class NhomSanPhamServiceImpl implements NhomSanPhamService {
	
	@Autowired
	NhomSanPhamRepository nhomSanPhamRepository;


    @Override
    @Transactional
    public NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
    	if(nhomSanPhamDTO.getNhomSanPhamId() == null || nhomSanPhamDTO.getNhomSanPhamId() <= 0) {
    		nhomSanPhamDTO.setNhomSanPhamId(null);
    		NhomSanPhamDTO resultDTO = nhomSanPhamRepository.addNhomSanPham(nhomSanPhamDTO);
    		return resultDTO;
    	} else {
    		throw new BadRequestException("Can not add nhom san pham");
    	}
    }

    @Override
    @Transactional
    public NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
    	if(nhomSanPhamDTO.getNhomSanPhamId() != null) {
    		return nhomSanPhamRepository.updateNhomSanPham(nhomSanPhamDTO);
    	} else {
    		throw new BadRequestException();
    	}
    }

    @Override
    public List<Integer> deleteNhomSanPham(List<Integer> nhomSanPhamIDList) {
        return nhomSanPhamRepository.deleteNhomSanPham(nhomSanPhamIDList);
    }

    @Override
    public NhomSanPhamDTO getNhomSanPhamDTOById(Integer nhomSanPhamID) throws Exception {
    	NhomSanPhamDTO nhomSanPhamDTO = nhomSanPhamRepository.getNhomSanPhamByID(nhomSanPhamID);
        return nhomSanPhamDTO;
    }

    @Override
    public ListResponse<NhomSanPhamDTO> getNhomSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        List<NhomSanPhamDTO> listDTO = nhomSanPhamRepository.getAll(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        ListResponse<NhomSanPhamDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount((long)listDTO.size());
    	return response;
    }
}
