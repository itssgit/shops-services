package com.itss.shops.repository;

import com.itss.shops.common.exception.RestException;
import com.itss.shops.dto.ChiTietNhapHangDTO;
import com.itss.shops.entity.ChiTietNhapHang;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

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
        return null;
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
        return null;
    }
}
