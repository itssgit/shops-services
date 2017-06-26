package com.itss.shops.repository;

import com.itss.shops.dto.ChiTietSanPhamDTO;

/**
 * Created by hungdd-cadpro on 26/06/2017.
 */
public interface ChiTietSanPhamRepositoryCustom {
    ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);
    Integer deleteChiTietSanPhamById(Integer chiTietSanPhamID);
}
