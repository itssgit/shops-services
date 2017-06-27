package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhachHangDTO;
import org.springframework.stereotype.Service;
import com.itss.shops.service.KhachHangService;

import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {


    @Override
    public KhachHangDTO addKhachHang(KhachHangDTO khachHangDTO) {
        return null;
    }

    @Override
    public KhachHangDTO updateKhachHang(KhachHangDTO khachHangDTO) {
        return null;
    }

    @Override
    public Integer deleteKhachHang(Integer khachHangID) {
        return null;
    }

    @Override
    public Optional<KhachHangDTO> getKhachHangDTOById(Integer khachHangID) {
        return null;
    }

    @Override
    public ListResponse<KhachHangDTO> getKhachHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }

    @Override
    public Boolean mergeBan(Integer banParentID, Integer banID) {
        return null;
    }

    @Override
    public Boolean splitBan(Integer banID) {
        return null;
    }
}
