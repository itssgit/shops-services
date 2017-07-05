package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.repository.NguyenLieuRepository;
import com.itss.shops.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguyenLieuServiceImpl implements NguyenLieuService {

    @Autowired
    private NguyenLieuRepository nguyenLieuRepository;

    @Override
    public NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        if (nguyenLieuDTO.getNguyenLieuId() == null || nguyenLieuDTO.getNguyenLieuId() == 0) {
            nguyenLieuDTO.setNguyenLieuId(null);
            return nguyenLieuRepository.addNguyenLieu(nguyenLieuDTO);
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        if (nguyenLieuDTO.getNguyenLieuId() != null) {
            return nguyenLieuRepository.updateNguyenLieu(nguyenLieuDTO);
        } else {
            throw new BadRequestException();
        }
    }

    @Override
    public Integer deleteNguyenLieu(Integer nguyenLieuID) {
        return nguyenLieuRepository.deleteNguyenLieu(nguyenLieuID);
    }

    @Override
    public ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder,
                                                     Boolean isShowInactive, String searchText) {
        return nguyenLieuRepository.getNguyenLieu(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
    }

    @Override
    public NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID) {


       return nguyenLieuRepository.getNguyenLieuDTOById(nguyenLieuID);
    }

}
