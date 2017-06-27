package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhanVienDTO;
import org.springframework.stereotype.Service;
import com.itss.shops.service.NhanVienService;

import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {


    @Override
    public NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO) {
        return null;
    }

    @Override
    public NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO) {
        return null;
    }

    @Override
    public Integer deleteNhanVien(Integer nhanVienID) {
        return null;
    }

    @Override
    public Optional<NhanVienDTO> getNhanVienDTOById(Integer nhanVienID) {
        return null;
    }

    @Override
    public ListResponse<NhanVienDTO> getNhanVien(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
