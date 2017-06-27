package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.dto.KhuyenMaiDTO;
import org.springframework.stereotype.Service;
import com.itss.shops.service.KhuyenMaiService;

import java.util.Optional;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {


    @Override
    public KhuyenMaiDTO addKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
        return null;
    }

    @Override
    public KhuyenMaiDTO updateKhuyenMai(KhuyenMaiDTO khuyenMaiDTO) {
        return null;
    }

    @Override
    public Integer deleteKhuyenMai(Integer khuyenMaiID) {
        return null;
    }

    @Override
    public Optional<KhuyenMaiDTO> getKhuyenMaiDTOById(Integer khuyenMaiID) {
        return null;
    }

    @Override
    public ListResponse<KhuyenMaiDTO> getKhuyenMai(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }

    @Override
    public Boolean IsExpired(Integer khuyenMaiID) {
        return null;
    }

    @Override
    public ListResponse<KhuyenMaiDTO> getKhuyenMaiAvailable(DonHangDTO donHangDTO) {
        return null;
    }
}
