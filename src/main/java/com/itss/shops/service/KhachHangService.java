package com.itss.shops.service;

import java.util.Optional;

import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.AccountDTO;
import com.itss.shops.entity.Account;
import com.itss.shops.vo.request.AccountRequestVo;
import com.itss.shops.vo.response.AccountResponse;

public interface KhachHangService {
	
	Optional<Account> getAccountByLoginId(String loginId);
	
	ListResponse<AccountResponse> getUsers(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive,
			String searchText);
	ListResponse<AccountDTO> getUsers2(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive,
			String searchText);
	
	Integer addAccount(AccountRequestVo accountRequest);

}
