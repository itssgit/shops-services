package com.itss.shops.service;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.SanPhamDTO;

public interface SanPhamService {

    SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO);

    SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO);

    Integer deleteSanPham(Integer sanphamID);

    ListResponse<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

    SanPhamDTO getSanPhamDTOById(Integer sanphamID);

}
