package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.entity.SanPham;
import com.itss.shops.repository.predicate.SanPhamPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SanPhamRepositoryImpl implements SanPhamRepositoryCustom {

    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO) {
        SanPham sanPham = modelMapper.map(sanPhamDTO, SanPham.class);
        sanPhamRepository.saveAndFlush(sanPham);

        return modelMapper.map(sanPham, SanPhamDTO.class);
    }

    @Override
    public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO) {
        SanPham sanPham = modelMapper.map(sanPhamDTO, SanPham.class);

        SanPham sanPhamUpdate = sanPhamRepository.findOne(sanPhamDTO.getSanPhamId());
        if (sanPhamUpdate.getSanPhamId() != null) {
            sanPhamUpdate = sanPham;
            sanPhamRepository.saveAndFlush(sanPhamUpdate);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(sanPhamUpdate, SanPhamDTO.class);
    }

    @Override
    public Integer deleteSanPhamById(Integer sanPhamId) {
        SanPham sanPham = sanPhamRepository.findById(sanPhamId).orElse(new SanPham());
        if (sanPham.getSanPhamId() != null) {
            sanPham.setTrangThaiXoa(1);
            sanPham.setThoiGianXoa(new Date());
            sanPhamRepository.saveAndFlush(sanPham);
        } else {
            throw new RestException("Record doesn't exist");
        }
        return sanPham.getSanPhamId();
    }


    @Override
    public List<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder,
                                       Boolean isShowInactive, String searchText) {
        PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
        Predicate where = SanPhamPredicate.findSanPham(searchText, isShowInactive);
        Page<SanPham> pageSanPham = sanPhamRepository.findAll(where, pageRequest);

        List<SanPham> listSanPham = pageSanPham.getContent();
        List<SanPhamDTO> result = new ArrayList<>();
        if (pageSanPham.getTotalElements() > 0) {
            for (SanPham sanPham : listSanPham) {
                SanPhamDTO sanPhamDTO = modelMapper.map(sanPham, SanPhamDTO.class);
                result.add(sanPhamDTO);
            }
        }

        return result;
    }


    @Override
    public SanPhamDTO getSanPhamDTOById(Integer sanphamID) {
        SanPham sanPham = sanPhamRepository.findOne(sanphamID);

        if(sanPham == null){
            throw new RestException("Record doesn't exist");
        }

        return modelMapper.map(sanPham, SanPhamDTO.class);
    }
}
