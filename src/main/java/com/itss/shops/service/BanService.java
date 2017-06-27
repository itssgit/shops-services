package com.itss.shops.service;


import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.BanDTO;

import java.util.Optional;

public interface BanService {

    BanDTO addBan(BanDTO banDTO);

    BanDTO updateBan(BanDTO banDTO);

    Integer deleteBan(Integer banID);

    Optional<BanDTO> getBanDTOById(Integer banID);

    ListResponse<BanDTO> getBan(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText);

}
