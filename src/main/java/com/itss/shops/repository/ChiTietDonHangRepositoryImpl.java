package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.dto.ChiTietDonHangDTO;
import com.itss.shops.entity.ChiTietDonHang;
import com.itss.shops.repository.predicate.ChiTietDonHangPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hungdd-cadpro on 21/07/2017.
 */
public class ChiTietDonHangRepositoryImpl implements ChiTietDonHangRepositoryCustom {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChiTietDonHangRepository chiTietDonHangRepository;

    @Override
    public ChiTietDonHangDTO addChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO) {
        ChiTietDonHang chiTietDonHang = modelMapper.map(chiTietDonHangDTO, ChiTietDonHang.class);
        chiTietDonHangRepository.saveAndFlush(chiTietDonHang);
        return modelMapper.map(chiTietDonHang, ChiTietDonHangDTO.class);
    }

    @Override
    public ChiTietDonHangDTO updateChiTietDonHang(ChiTietDonHangDTO chiTietDonHangDTO) {
        ChiTietDonHang chiTietDonHang = modelMapper.map(chiTietDonHangDTO, ChiTietDonHang.class);

        ChiTietDonHang chiTietDonHangUpdate = chiTietDonHangRepository.findOne(chiTietDonHangDTO.getChiTietDonHangId());
        if (chiTietDonHangUpdate.getChiTietDonHangId() != null) {
            chiTietDonHangUpdate = chiTietDonHang;
            chiTietDonHangRepository.saveAndFlush(chiTietDonHangUpdate);
        } else throw new RestException("Record doesn't exist");

        return modelMapper.map(chiTietDonHangUpdate, ChiTietDonHangDTO.class);
    }

    @Override
    public Integer deleteChiTietDonHang(Integer chiTietDonHangID) {
        ChiTietDonHang chiTietDonHang
                = chiTietDonHangRepository.findOne(chiTietDonHangID);

        if (chiTietDonHang != null) {
            chiTietDonHang.setTrangThaiXoa(1);
            chiTietDonHang.setThoiGianXoa(new Date());
        } else {
            throw new RestException("Record doesn't exist");
        }
        return chiTietDonHang.getChiTietDonHangId();
    }

    @Override
    public ChiTietDonHangDTO getChiTietDonHangDTOById(Integer chiTietDonHangID) {
        ChiTietDonHang chiTietDonHang = chiTietDonHangRepository.findOne(chiTietDonHangID);

        if(chiTietDonHang == null){
            throw new RestException("Record doesn't exist");
        }

        return modelMapper.map(chiTietDonHang, ChiTietDonHangDTO.class);
    }

    @Override
    public List<ChiTietDonHangDTO> getChiTietDonHangDtosByDonHangId(Integer donHangId) {
        Predicate where = ChiTietDonHangPredicate.findByDonHangId(donHangId);
        Iterator<ChiTietDonHang> listChiTietDonHangIterator = chiTietDonHangRepository.findAll(where).iterator();

        List<ChiTietDonHangDTO> result = new ArrayList<>();
        while (listChiTietDonHangIterator.hasNext()) {
            ChiTietDonHangDTO chiTietDonHangDTO = modelMapper.map(listChiTietDonHangIterator.next(), ChiTietDonHangDTO.class);
            result.add(chiTietDonHangDTO);
        }
        return result;
    }
}
