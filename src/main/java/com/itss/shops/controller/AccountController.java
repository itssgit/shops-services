package com.itss.shops.controller;

import javax.validation.Valid;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.AccountDTO;
import com.itss.shops.service.AccountService;
import com.itss.shops.vo.request.AccountRequestVo;
import com.itss.shops.vo.response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/api/admin/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<AccountResponse>> getUsers(
			@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
			@RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
			@RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
			@RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
			@RequestParam(value = "searchText", required = false) String searchText
			) {
//		log.debug("Received request to list users");
		ListResponse<AccountResponse> results = accountService.getUsers(pageNum, pageSize, sortBy,
				sortOrder, isShowInactive, searchText);
		CommonResponse<ListResponse<AccountResponse>> response = new CommonResponse<ListResponse<AccountResponse>>();
		response.successfulRespone(results);
		
		return response;
	}
	
	@RequestMapping(value = "/getUser2", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<AccountDTO>> getUsers2(
			@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
			@RequestParam(value = "sortBy", required = false, defaultValue = "id") String sortBy,
			@RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
			@RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
			@RequestParam(value = "searchText", required = false) String searchText
			) {
//		log.debug("Received request to list users");
		ListResponse<AccountDTO> results = accountService.getUsers2(pageNum, pageSize, sortBy,
				sortOrder, isShowInactive, searchText);
		CommonResponse<ListResponse<AccountDTO>> response = new CommonResponse<ListResponse<AccountDTO>>();
		response.successfulRespone(results);
		
		return response;
	}
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, consumes = "application/json")
	public CommonResponse<String> createrUsers(@RequestBody @Valid final AccountDTO accountRequest) {
		CommonResponse<String> response = new CommonResponse<>();
		try {
//			if (accountRequest.getRoleId() == null
//					|| accountRequest.getRoleId() <= 0) {
//				throw new BadRequestException("Role is null or invalid!");
//			}
//			Integer result = accountService.addAccount(accountRequest);
			String result = accountRequest.logInfo();
			response.successfulRespone(result);
		} catch (BadRequestException ex){
			response.failedRespone("-1", ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
	public CommonResponse<String> test() {
		CommonResponse<String> response = new CommonResponse<>();
		response.successfulRespone("OK");
		return response;
	}

}
