package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.service.DonHangService;
import org.springframework.stereotype.Service;

@Service
public class DonHangServiceImpl implements DonHangService {


    @Override
    public DonHangDTO addDonHang(DonHangDTO donHangDTO) {
        //add donhang de lay id

        //add chitietdonhang

        //add hangkhuyenmai

        return null;
    }

    @Override
    public DonHangDTO updateDonHang(DonHangDTO donHangDTO) {
        //update don hang

        //update chitietdonhang

        //update hangkhuyenmai

        return null;
    }

    @Override
    public Integer deleteDonHang(Integer donhangID) {
        //delete donhang

        return null;
    }

    @Override
    public DonHangDTO getDonHangDTOById(Integer donhangID) {
        return null;
    }

    @Override
    public ListResponse<DonHangDTO> getDonHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
