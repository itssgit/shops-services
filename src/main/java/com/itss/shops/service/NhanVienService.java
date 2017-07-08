package com.itss.shops.service;

import java.util.List;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhanVienDTO;

public interface NhanVienService {

    NhanVienDTO addNhanVien(NhanVienDTO nhanVienDTO);

    NhanVienDTO updateNhanVien(NhanVienDTO nhanVienDTO);

    List<Integer> deleteNhanVien(List<Integer> nhanVienIDList);

    NhanVienDTO getNhanVienDTOById(Integer nhanVienID);

    ListResponse<NhanVienDTO> getNhanVien(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
