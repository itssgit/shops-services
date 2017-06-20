package com.itss.shops.controller;

import javax.validation.Valid;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.AccountDTO;
import com.itss.shops.service.AccountService;
import com.itss.shops.service.NguyenLieuService;
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
@RequestMapping("/api/admin/nguyenlieu")
public class NguyenLieuController {
	
	@Autowired
	NguyenLieuService nguyenLieuService;

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
	public CommonResponse<String> test() {
		CommonResponse<String> response = new CommonResponse<String>();

		response.successfulRespone("OK");
		return response;
	}

}
