package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.HangKhuyenMaiDTO;
import org.springframework.stereotype.Service;
import com.itss.shops.service.HangKhuyenMaiService;

import java.util.Optional;

@Service
public class HangKhuyenMaiServiceImpl implements HangKhuyenMaiService {


    @Override
    public HangKhuyenMaiDTO addHangKhuyenMai(HangKhuyenMaiDTO hangHangKhuyenMaiDTO) {
        return null;
    }

    @Override
    public HangKhuyenMaiDTO updateHangKhuyenMai(HangKhuyenMaiDTO hangHangKhuyenMaiDTO) {
        return null;
    }

    @Override
    public Integer deleteHangKhuyenMai(Integer hangHangKhuyenMaiID) {
        return null;
    }

    @Override
    public Optional<HangKhuyenMaiDTO> getHangKhuyenMaiDTOById(Integer hangHangKhuyenMaiID) {
        return null;
    }

    @Override
    public ListResponse<HangKhuyenMaiDTO> getHangKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
