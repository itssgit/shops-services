package com.itss.shops.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhanVienDTO;
import com.itss.shops.repository.NhanVienRepository;
import com.itss.shops.service.NhanVienService;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	@Autowired
	NhanVienRepository nhanVienRepository;


    @Override
    @Transactional
    public NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO) {
    	if(nhanVienDTO.getNhanVienId() != null || nhanVienDTO.getNhanVienId() <= 0 ) {
    		nhanVienDTO.setNhanVienId(null);
    		NhanVienDTO resultDTO = nhanVienRepository.addNhanVien(nhanVienDTO);
    		return resultDTO;
    	} else {
    		throw new BadRequestException("Can not add nhan vien");
    	}
    }

    @Override
    @Transactional
    public NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO) {
    	if(nhanVienDTO.getNhanVienId() != null) {
    		return nhanVienRepository.updateNhanVien(nhanVienDTO);
    	}
    	else {
    		throw new BadRequestException();
    	}
    }

    @Override
    public ListResponse<NhanVienDTO> getNhanVien(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        List<NhanVienDTO> listDTO = nhanVienRepository.getAll(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        ListResponse<NhanVienDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount((long) listDTO.size());
    	return response;
    }

	@Override
	public List<Integer> deleteNhanVien(List<Integer> nhanVienIDList) {
		// TODO Auto-generated method stub
		return nhanVienRepository.deleteNhanVien(nhanVienIDList);
	}

	@Override
	public NhanVienDTO getNhanVienDTOById(Integer nhanVienID) {
		// TODO Auto-generated method stub
		NhanVienDTO nhanVienDTO = nhanVienRepository.getNhanVienByID(nhanVienID);
		return nhanVienDTO;
	}
}
