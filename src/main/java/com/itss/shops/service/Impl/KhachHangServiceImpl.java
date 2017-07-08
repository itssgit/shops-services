package com.itss.shops.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhachHangDTO;
import com.itss.shops.entity.KhachHang;
import com.itss.shops.repository.KhachHangRepository;
import com.itss.shops.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	
	@Autowired
	KhachHangRepository khachHangRepository;


    @Override
    @Transactional
    public KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO) {
    	if(khachHangDTO.getKhachhangId() == null || khachHangDTO.getKhachhangId() <= 0) {
    		khachHangDTO.setKhachhangId(null);
    		KhachHangDTO resultDTO = khachHangRepository.addKhachHang(khachHangDTO);
    		return resultDTO;
    	} else {
    		throw new BadRequestException("Can not add nhom san pham");
    	}
    }

    @Override
    public KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO) {
    	if(khachHangDTO.getKhachhangId() != null) {
    		return khachHangRepository.updateKhachHang(khachHangDTO);
    	} else {
    		throw new BadRequestException();
    	}
    }

    @Override
    public ListResponse<KhachHangDTO> getKhachHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        List<KhachHangDTO> listDTO = khachHangRepository.getAll(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        ListResponse<KhachHangDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount((long) listDTO.size());
    	return response;
    }

    @Override
    public Boolean mergeBan(Integer banParentID, Integer banID) {
        return null;
    }

    @Override
    public Boolean splitBan(Integer banID) {
        return null;
    }

	@Override
	public List<Integer> deleteKhachHang(List<Integer> khachHangIdList) {
		// TODO Auto-generated method stub
		return khachHangRepository.deleteKhachHang(khachHangIdList);
	}

	@Override
	public KhachHangDTO getKhachHangDTOById(Integer khachHangID) {
		// TODO Auto-generated method stub
		KhachHangDTO khachHangDTO = khachHangRepository.getKhachHangById(khachHangID);
		return khachHangDTO;
	}
}
