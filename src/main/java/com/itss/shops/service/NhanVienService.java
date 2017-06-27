package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhanVienDTO;

import java.util.Optional;

public interface NhanVienService {

    NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO);

    NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO);

    Integer deleteNhanVien(Integer nhanVienID);

    Optional<NhanVienDTO> getNhanVienDTOById(Integer nhanVienID);

    ListResponse<NhanVienDTO> getNhanVien(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
