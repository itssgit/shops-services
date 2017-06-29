package com.itss.shops.service.Impl;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.BanDTO;
import com.itss.shops.service.BanService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BanServiceImpl implements BanService {


    @Override
    public BanDTO addBan(BanDTO banDTO) {
        return null;
    }

    @Override
    public BanDTO updateBan(BanDTO banDTO) {
        return null;
    }

    @Override
    public Integer deleteBan(Integer banID) {
        return null;
    }

    @Override
    public Optional<BanDTO> getBanDTOById(Integer banID) {
        return null;
    }

    @Override
    public ListResponse<BanDTO> getBan(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        return null;
    }
}
