package com.itss.shops.repository;

import com.itss.shops.dto.ChiTietSanPhamDTO;

import java.util.List;

/**
 * Created by hungdd-cadpro on 26/06/2017.
 */
public interface ChiTietSanPhamRepositoryCustom {
    ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

    Integer deleteChiTietSanPhamById(Integer chiTietSanPhamID);

    ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO);

    ChiTietSanPhamDTO getChiTietSanPhamDTOById(Integer chiTietSanPhamID);

    List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID);

}
