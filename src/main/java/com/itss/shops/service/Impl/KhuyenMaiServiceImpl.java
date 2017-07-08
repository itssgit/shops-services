package com.itss.shops.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.dto.KhuyenMaiDTO;
import com.itss.shops.repository.KhuyenMaiRepository;
import com.itss.shops.service.KhuyenMaiService;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
	
	@Autowired
	KhuyenMaiRepository khuyenMaiRepository;


    @Override
    @Transactional
    public KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
    	if(khuyenMaiDTO.getKhuyenMaiId() == null || khuyenMaiDTO.getKhuyenMaiId() <= 0) {
    		khuyenMaiDTO.setKhuyenMaiId(null);
    		KhuyenMaiDTO resultDTO = khuyenMaiRepository.addKhuyenMai(khuyenMaiDTO);
    		return resultDTO;
    	} else {
    		throw new BadRequestException("Can not add khuyen mai");
    	}
    }

    @Override
    @Transactional
    public KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
    	if(khuyenMaiDTO.getKhuyenMaiId() != null) {
    		return khuyenMaiRepository.updateKhuyenMai(khuyenMaiDTO);
    	}
    	else {
    		throw new BadRequestException();
    	}
    }

    @Override
    public ListResponse<KhuyenMaiDTO> getKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        List<KhuyenMaiDTO> listDTO = khuyenMaiRepository.getAll(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        ListResponse<KhuyenMaiDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount((long)listDTO.size());
    	return response;
    }

    @Override
    public Boolean IsExpired(Integer khuyenMaiID) {
        return null;
    }

    @Override
    public ListResponse<KhuyenMaiDTO> getKhuyenMaiAvailable(DonHangDTO donHangDTO) {
        return null;
    }

	@Override
	public List<Integer> deleteKhuyenMai(List<Integer> khuyenMaiIDList) {
		// TODO Auto-generated method stub
		return khuyenMaiRepository.deleteKhuyenMai(khuyenMaiIDList);
	}

	@Override
	public KhuyenMaiDTO getKhuyenMaiDTOById(Integer khuyenMaiID) {
		// TODO Auto-generated method stub
		KhuyenMaiDTO khuyenMaiDTO = khuyenMaiRepository.getKhuyenMaiByID(khuyenMaiID);
		return khuyenMaiDTO;
	}
}
