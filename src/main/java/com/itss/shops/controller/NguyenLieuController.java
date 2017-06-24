package com.itss.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.service.NguyenLieuService;

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
