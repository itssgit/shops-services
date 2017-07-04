package com.itss.shops.service;

import java.util.List;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhomSanPhamDTO;

public interface NhomSanPhamService {

    NhomSanPhamDTO addNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);

    NhomSanPhamDTO updateNhomSanPham(NhomSanPhamDTO nhomSanPhamDTO);

    List<Integer> deleteNhomSanPham(List<Integer> nhomSanPhamIdList);

    NhomSanPhamDTO getNhomSanPhamDTOById(Integer nhomSanPhamID);

    ListResponse<NhomSanPhamDTO> getNhomSanPham(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
