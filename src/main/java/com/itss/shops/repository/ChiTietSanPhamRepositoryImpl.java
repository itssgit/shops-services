package com.itss.shops.repository;

import com.itss.shops.common.constant.Errors;
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.exception.RestException;
import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.entity.ChiTietSanPham;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by hungdd-cadpro on 26/06/2017.
 */
public class ChiTietSanPhamRepositoryImpl implements ChiTietSanPhamRepositoryCustom{

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        ChiTietSanPham chiTietSanPham = modelMapper.map(chiTietSanPhamDTO, ChiTietSanPham.class);
        try {
            chiTietSanPhamRepository.saveAndFlush(chiTietSanPham);

        } catch (Exception ex) {
            throw new RestException(Errors.ERROR_CODE_DB, Errors.ERROR_CODE_DB_MSG);
        }
        return modelMapper.map(chiTietSanPham, ChiTietSanPhamDTO.class);
    }

    @Override
    public Integer deleteChiTietSanPhamById(Integer chiTietSanPhamID) {
        ChiTietSanPham chiTietSanPham
                = chiTietSanPhamRepository.findOne(chiTietSanPhamID);

        if (chiTietSanPham != null) {
            chiTietSanPham.setTrangThaiXoa(1);
            chiTietSanPham.setThoiGianXoa(new Date());
            try {
                chiTietSanPhamRepository.saveAndFlush(chiTietSanPham);
            } catch (Exception ex) {
                throw new RestException(Errors.ERROR_CODE_DB, Errors.ERROR_CODE_DB_MSG);
            }
        } else {
            throw new BadRequestException();
        }
        return chiTietSanPham.getSanPhamId();
    }
}
