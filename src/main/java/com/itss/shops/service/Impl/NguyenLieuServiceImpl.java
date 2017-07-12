package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.repository.NguyenLieuRepository;
import com.itss.shops.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<NguyenLieuDTO> addListNguyenLieu(List<NguyenLieuDTO> nguyenLieuDTOList) {
        List<NguyenLieuDTO> listAdded = new ArrayList<>();
        nguyenLieuDTOList.forEach(nguyenLieuDTO->{
            try {
                listAdded.add(this.addNguyenLieu(nguyenLieuDTO));
            }catch (Exception ex) {
                //log exception and do nothing
            }
        });
        return listAdded;
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
    public List<Integer> deleteListNguyenLieu(List<Integer> listNguyenLieuId) {
        List<Integer> listDeleted = new ArrayList<>();
        listNguyenLieuId.forEach(nguyenLieuId->{
            try {
                this.deleteNguyenLieu(nguyenLieuId);
                listDeleted.add(nguyenLieuId);
            }catch (Exception ex) {
                //log exception and do nothing
            }
        });
        return listDeleted;
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
