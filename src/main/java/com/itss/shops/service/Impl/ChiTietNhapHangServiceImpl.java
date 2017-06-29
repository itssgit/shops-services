package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.service.ChiTietNhapHangService;
import org.springframework.stereotype.Service;

@Service
public class ChiTietNhapHangServiceImpl implements ChiTietNhapHangService {


    @Override
    public NguyenLieuDTO addNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        return null;
    }

    @Override
    public NguyenLieuDTO updateNguyenLieu(NguyenLieuDTO nguyenLieuDTO) {
        return null;
    }

    @Override
    public Integer deleteNguyenLieu(Integer nguyenLieuID) {
        return null;
    }

    @Override
    public NguyenLieuDTO getNguyenLieuDTOById(Integer nguyenLieuID) {
        return null;
    }

    @Override
    public ListResponse<NguyenLieuDTO> getNguyenLieu(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
