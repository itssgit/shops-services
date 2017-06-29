package com.itss.shops.repository;

import com.itss.shops.dto.SanPhamDTO;

import java.util.List;

public interface SanPhamRepositoryCustom {
    public SanPhamDTO addSanPham(SanPhamDTO sanPhamDTO);

    public SanPhamDTO updateSanPham(SanPhamDTO sanPhamDTO);

    public Integer deleteSanPhamById(Integer sanPhamId);

    public SanPhamDTO getSanPhamDTOById(Integer sanphamID);

    public List<SanPhamDTO> getSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);
}
