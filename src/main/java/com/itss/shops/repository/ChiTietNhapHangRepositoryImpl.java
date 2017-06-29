package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.entity.ChiTietNhapHang;
import com.itss.shops.repository.predicate.ChiTietNhapHangPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hungdd-cadpro on 29/06/2017.
 */
public class ChiTietNhapHangRepositoryImpl implements ChiTietNhapHangRepositoryCustom {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChiTietNhapHangRepository chiTietNhapHangRepository;

    @Override
    public ChiTietNhapHangDTO addChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO) {
        ChiTietNhapHang chiTietNhapHang = modelMapper.map(chiTietNhapHangDTO, ChiTietNhapHang.class);
        chiTietNhapHangRepository.saveAndFlush(chiTietNhapHang);
        return modelMapper.map(chiTietNhapHang, ChiTietNhapHangDTO.class);
    }

    @Override
    public ChiTietNhapHangDTO updateChiTietNhapHang(ChiTietNhapHangDTO chiTietNhapHangDTO) {
        ChiTietNhapHang chiTietNhapHang = modelMapper.map(chiTietNhapHangDTO, ChiTietNhapHang.class);

        ChiTietNhapHang chiTietNhapHangUpdate = chiTietNhapHangRepository.findOne(chiTietNhapHangDTO.getChiTietNhapHangId());
        if (chiTietNhapHangUpdate.getChiTietNhapHangId() != null) {
            chiTietNhapHangUpdate = chiTietNhapHang;
            chiTietNhapHangRepository.saveAndFlush(chiTietNhapHangUpdate);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(chiTietNhapHangUpdate, ChiTietNhapHangDTO.class);
    }

    @Override
    public Integer deleteChiTietNhapHang(Integer chiTietNhapHangID) {
        ChiTietNhapHang chiTietNhapHang
                = chiTietNhapHangRepository.findOne(chiTietNhapHangID);

        if (chiTietNhapHang != null) {
            chiTietNhapHang.setTrangThaiXoa(1);
            chiTietNhapHang.setThoiGianXoa(new Date());
        } else {
            throw new RestException("Record doesn't exist");
        }
        return chiTietNhapHang.getChiTietNhapHangId();
    }

    @Override
    public ChiTietNhapHangDTO getChiTietNhapHangDTOById(Integer chiTietNhapHangID) {
        return modelMapper.map(chiTietNhapHangRepository.findOne(chiTietNhapHangID), ChiTietNhapHangDTO.class);
    }

    @Override
    public List<ChiTietNhapHangDTO> getChiTietNhapHangDtosByPhieuNhapId(Integer phieuNhapId) {
        Predicate where = ChiTietNhapHangPredicate.findByPhieuNhapId(phieuNhapId);
        Iterator<ChiTietNhapHang> listChiTietNhapHangIterator = chiTietNhapHangRepository.findAll(where).iterator();

        List<ChiTietNhapHangDTO> result = new ArrayList<>();
        while (listChiTietNhapHangIterator.hasNext()) {
            ChiTietNhapHangDTO chiTietNhapHangDTO = modelMapper.map(listChiTietNhapHangIterator.next(), ChiTietNhapHangDTO.class);
            result.add(chiTietNhapHangDTO);
        }
        return result;
    }
}
