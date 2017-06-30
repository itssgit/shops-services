package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.common.utils.MPUtils;
import com.itss.shops.dto.PhieuNhapDTO;
import com.itss.shops.entity.PhieuNhap;
import com.itss.shops.repository.predicate.PhieuNhapPredicate;
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
public class PhieuNhapRepositoryImpl implements PhieuNhapRepositoryCustom {

    @Autowired
    private PhieuNhapRepository phieuNhapRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PhieuNhapDTO addPhieuNhap(PhieuNhapDTO phieuNhapDTO) {
        PhieuNhap phieuNhap = modelMapper.map(phieuNhapDTO, PhieuNhap.class);
        phieuNhapRepository.saveAndFlush(phieuNhap);

        return modelMapper.map(phieuNhap, PhieuNhapDTO.class);
    }

    @Override
    public PhieuNhapDTO updatePhieuNhap(PhieuNhapDTO phieuNhapDTO) {
        PhieuNhap phieuNhap = modelMapper.map(phieuNhapDTO, PhieuNhap.class);

        PhieuNhap phieuNhapUpdate = phieuNhapRepository.findOne(phieuNhapDTO.getPhieuNhapId());
        if (phieuNhapUpdate.getPhieuNhapId() != null) {
            phieuNhapUpdate = phieuNhap;
            phieuNhapRepository.saveAndFlush(phieuNhapUpdate);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(phieuNhapUpdate, PhieuNhapDTO.class);
    }

    @Override
    public Integer deletePhieuNhap(Integer phieuNhapID) {
        PhieuNhap phieuNhap = phieuNhapRepository.findOne(phieuNhapID);
        if (phieuNhap.getPhieuNhapId() != null) {
            phieuNhap.setTrangThaiXoa(1);
            phieuNhap.setThoiGianXoa(new Date());
            phieuNhapRepository.saveAndFlush(phieuNhap);
        } else {
            throw new RestException("Record doesn't exist");
        }
        return phieuNhap.getPhieuNhapId();
    }

    @Override
    public PhieuNhapDTO getPhieuNhapDTOById(Integer phieuNhapID) {
        return modelMapper.map(phieuNhapRepository.findOne(phieuNhapID), PhieuNhapDTO.class);
    }

    @Override
    public List<PhieuNhapDTO> getPhieuNhap(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        PageRequest pageRequest = MPUtils.getPageRequest(pageNum, pageSize, sortBy, sortOrder);
        Predicate where = PhieuNhapPredicate.PhieuNhap(searchText, isShowInactive);
        Page<PhieuNhap> pagePhieuNhap = phieuNhapRepository.findAll(where, pageRequest);

        List<PhieuNhap> listPhieuNhap = pagePhieuNhap.getContent();
        List<PhieuNhapDTO> result = new ArrayList<>();
        if (pagePhieuNhap.getTotalElements() > 0) {
            for (PhieuNhap phieuNhap : listPhieuNhap) {
                PhieuNhapDTO phieuNhapDTO = modelMapper.map(phieuNhap, PhieuNhapDTO.class);
                result.add(phieuNhapDTO);
            }
        }

        return result;
    }
}
