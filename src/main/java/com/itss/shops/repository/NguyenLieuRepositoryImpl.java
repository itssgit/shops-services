package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.entity.NguyenLieu;
import com.itss.shops.repository.predicate.NguyenLieuPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hungdd-cadpro on 29/06/2017.
 */
public class NguyenLieuRepositoryImpl implements NguyenLieuRepositoryCustom {

    @Autowired
    private NguyenLieuRepository nguyenLieuRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        NguyenLieu nguyenLieu = modelMapper.map(nguyenLieuDTO, NguyenLieu.class);
        nguyenLieuRepository.saveAndFlush(nguyenLieu);

        return modelMapper.map(nguyenLieu, NguyenLieuDTO.class);
    }

    @Override
    public NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        NguyenLieu nguyenLieu = modelMapper.map(nguyenLieuDTO, NguyenLieu.class);

        NguyenLieu nguyenLieuUpdate = nguyenLieuRepository.findOne(nguyenLieuDTO.getNguyenLieuId());
        if (nguyenLieuUpdate.getNguyenLieuId() != null) {
            nguyenLieuUpdate = nguyenLieu;
            nguyenLieuRepository.saveAndFlush(nguyenLieu);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(nguyenLieuUpdate, NguyenLieuDTO.class);
    }

    @Override
    public Integer deleteNguyenLieu(Integer nguyenLieuID) {
        NguyenLieu nguyenLieu = nguyenLieuRepository.findOne(nguyenLieuID);
        if (nguyenLieu.getNguyenLieuId() != null) {
            nguyenLieu.setTrangThaiXoa(1);
            nguyenLieu.setThoiGianXoa(new Date());
            nguyenLieuRepository.saveAndFlush(nguyenLieu);
        } else {
            throw new RestException("Record doesn't exist");
        }
        return nguyenLieu.getNguyenLieuId();
    }

    @Override
    public NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID) {
        NguyenLieu nguyenLieu = nguyenLieuRepository.findOne(nguyenLieuID);

        if(nguyenLieu == null){
            throw new RestException("Record doesn't exist");
        }

        return modelMapper.map(nguyenLieu, NguyenLieuDTO.class);
    }

    @Override
    public ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
        Predicate where = NguyenLieuPredicate.findNguyenLieu(searchText, isShowInactive);
        Page<NguyenLieu> nguyenLieuPage = nguyenLieuRepository.findAll(where, pageRequest);

        List<NguyenLieu> nguyenLieuList = nguyenLieuPage.getContent();
        List<NguyenLieuDTO> result = new ArrayList<>();
        if (nguyenLieuPage.getTotalElements() > 0) {
            for (NguyenLieu nguyenLieu : nguyenLieuList) {
                NguyenLieuDTO nguyenLieuDTO = modelMapper.map(nguyenLieu, NguyenLieuDTO.class);
                result.add(nguyenLieuDTO);
            }
        }

        ListResponse<NguyenLieuDTO> response = new ListResponse<>();
        response.setList(result);
        response.setTotalCount(Long.valueOf(result.size()));

        return response;
    }
}
