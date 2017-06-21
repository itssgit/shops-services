package com.itss.shops.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.service.SanPhamService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/api/sanpham")
public class SanPhamController {
	
	@Autowired
	SanPhamService sanPhamService;

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
	public CommonResponse<String> test() {
		CommonResponse<String> response = new CommonResponse<String>();

		response.successfulRespone("OK");
		return response;
	}
	
	@RequestMapping(value ="/create", method = RequestMethod.POST, produces = "application/json")
	public CommonResponse<SanPhamDTO> addSanPham(@RequestBody @Valid final SanPhamDTO sanPhamDTO){		
		CommonResponse<SanPhamDTO> response = new CommonResponse<>();
		SanPhamDTO addedDTO = new SanPhamDTO();
		try {
			addedDTO = sanPhamService.addSanPham(sanPhamDTO);
			response.successfulRespone(addedDTO);
		} catch(Exception ex) {
			response.failedRespone(addedDTO, ex.getMessage());			
		}				
		
		return response;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT, produces = "application/json" )
	public CommonResponse<SanPhamDTO> updateSanPham(@RequestBody @Valid final SanPhamDTO sanPhamDTO){
		CommonResponse<SanPhamDTO> response = new CommonResponse<>();
		SanPhamDTO updatedDTO = new SanPhamDTO();
		try {
			updatedDTO = sanPhamService.updateSanPham(sanPhamDTO);
			response.successfulRespone(updatedDTO);
		} catch(Exception ex) {
			response.failedRespone(updatedDTO, ex.getMessage());			
		}				
		
		return response;
	}
	
	

}
