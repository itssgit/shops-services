package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.entity.DonHang;
import com.itss.shops.repository.predicate.DonHangPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonHangRepositoryImpl implements DonHangRepositoryCustom{

    @Autowired
    private DonHangRepository donHangRepository;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DonHangDTO addDonHang(DonHangDTO donHangDTO) {
        DonHang donHang = modelMapper.map(donHangDTO, DonHang.class);
        donHangRepository.saveAndFlush(donHang);

        return modelMapper.map(donHang, DonHangDTO.class);
    }

    @Override
    public DonHangDTO updateDonHang(DonHangDTO donHangDTO) {
        DonHang donHang = modelMapper.map(donHangDTO, DonHang.class);

        DonHang donHangUpdate = donHangRepository.findOne(donHangDTO.getDonHangId());
        if (donHangUpdate.getDonHangId() != null) {
            donHangUpdate = donHang;
            donHangRepository.saveAndFlush(donHangUpdate);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(donHangUpdate, DonHangDTO.class);
    }

    @Override
    public Integer deleteDonHang(Integer donhangID) {
        DonHang donHang = donHangRepository.findOne(donhangID);
        if (donHang.getDonHangId() != null) {
            donHang.setTrangThaiXoa(1);
            donHang.setThoiGianXoa(new Date());
            donHangRepository.saveAndFlush(donHang);
        } else {
            throw new RestException("Record doesn't exist");
        }
        return donHang.getDonHangId();
    }

    @Override
    public DonHangDTO getDonHangDTOById(Integer donhangID) {
        DonHang donHang = donHangRepository.findOne(donhangID);

        if(donHang == null){
            throw new RestException("Record doesn't exist");
        }

        return modelMapper.map(donHang, DonHangDTO.class);
    }

    @Override
    public List<DonHangDTO> getDonHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
        Predicate where = DonHangPredicate.findDonHang(searchText, isShowInactive);
        Page<DonHang> pageDonHang = donHangRepository.findAll(where, pageRequest);

        List<DonHang> listDonHang = pageDonHang.getContent();
        List<DonHangDTO> result = new ArrayList<>();
        if (pageDonHang.getTotalElements() > 0) {
            for (DonHang donHang : listDonHang) {
                DonHangDTO donHangDTO = modelMapper.map(donHang, DonHangDTO.class);
                result.add(donHangDTO);
            }
        }

        return result;
    }
}
