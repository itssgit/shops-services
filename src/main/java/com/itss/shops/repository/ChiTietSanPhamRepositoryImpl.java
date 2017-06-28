package com.itss.shops.repository;

import com.itss.shops.common.constant.Errors;
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.exception.RestException;
import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.entity.ChiTietSanPham;
import com.itss.shops.entity.SanPham;
import com.itss.shops.repository.predicate.ChiTietSanPhamPredicate;
import com.querydsl.core.types.Predicate;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.*;

/**
 * Created by hungdd-cadpro on 26/06/2017.
 */
public class ChiTietSanPhamRepositoryImpl implements ChiTietSanPhamRepositoryCustom {

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

    @Override
    public ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        ChiTietSanPham chiTietSanPham = modelMapper.map(chiTietSanPhamDTO, ChiTietSanPham.class);
        if (chiTietSanPham.getChiTietSanPhamId() != null) {
            try {
                chiTietSanPhamRepository.saveAndFlush(chiTietSanPham);

            } catch (Exception ex) {
                throw new RestException(Errors.ERROR_CODE_DB, Errors.ERROR_CODE_DB_MSG);
            }
        }
        return modelMapper.map(chiTietSanPham, ChiTietSanPhamDTO.class);
    }

    @Override
    public ChiTietSanPhamDTO getChiTietSanPhamDTOById(Integer chiTietSanPhamID) {
        ChiTietSanPhamDTO result = new ChiTietSanPhamDTO();
        try {
            result = modelMapper.map(chiTietSanPhamRepository.findOne(chiTietSanPhamID), ChiTietSanPhamDTO.class);
        } catch (Exception ex) {

        }
        return result;
    }

    @Override
    public List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID) {
            Predicate where = ChiTietSanPhamPredicate.findBySanPhamId(sanPhamID);
            Iterator<ChiTietSanPham> listChiTietSanPhams = chiTietSanPhamRepository.findAll(where).iterator();

            List<ChiTietSanPhamDTO> result = new ArrayList<>();
            while(listChiTietSanPhams.hasNext()) {
                ChiTietSanPhamDTO chiTietSanPhamDTO = modelMapper.map(listChiTietSanPhams.next(), ChiTietSanPhamDTO.class);
                result.add(chiTietSanPhamDTO);
            }
            return result;
    }
}
