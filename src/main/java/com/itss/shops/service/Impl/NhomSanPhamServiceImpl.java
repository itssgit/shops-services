package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhomSanPhamDTO;
import org.springframework.stereotype.Service;
import com.itss.shops.service.NhomSanPhamService;

import java.util.Optional;

@Service
public class NhomSanPhamServiceImpl implements NhomSanPhamService {


    @Override
    public NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
        return null;
    }

    @Override
    public NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO) {
        return null;
    }

    @Override
    public Integer deleteNhomSanPham(Integer nhomSanPhamID) {
        return null;
    }

    @Override
    public Optional<NhomSanPhamDTO> getNhomSanPhamDTOById(Integer nhomSanPhamID) {
        return null;
    }

    @Override
    public ListResponse<NhomSanPhamDTO> getNhomSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
