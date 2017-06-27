package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhomSanPhamDTO;

import java.util.Optional;

public interface NhomSanPhamService {

    NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);

    NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);

    Integer deleteNhomSanPham(Integer nhomSanPhamID);

    Optional<NhomSanPhamDTO> getNhomSanPhamDTOById(Integer nhomSanPhamID);

    ListResponse<NhomSanPhamDTO> getNhomSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
