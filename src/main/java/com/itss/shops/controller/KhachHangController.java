package com.itss.shops.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhachHangDTO;
import com.itss.shops.service.KhachHangService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/khachhang")
public class KhachHangController {
	
	@Autowired
	KhachHangService khachHangService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public CommonResponse<KhachHangDTO> addKhachHang(@RequestBody @Valid final KhachHangDTO khachHangDTO) {
//		log.debug("### Recevied request to add new khach hang");
		CommonResponse<KhachHangDTO> response = new CommonResponse<>();
		KhachHangDTO addDTO = new KhachHangDTO();
		try {
			addDTO = khachHangService.addKhachHang(khachHangDTO);
			response.successfulRespone(addDTO);
		} catch (Exception ex) {
			response.failedRespone(addDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public CommonResponse<KhachHangDTO> updateKhachHang(@RequestBody @Valid final KhachHangDTO khachHangDTO) {
		CommonResponse<KhachHangDTO> response = new CommonResponse<>();
		KhachHangDTO updateDTO = new KhachHangDTO();
		try {
			updateDTO = khachHangService.updateKhachHang(khachHangDTO);
			response.successfulRespone(updateDTO);
		} catch (Exception ex) {
			response.failedRespone(updateDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteList", method = RequestMethod.DELETE, produces = "application/json")
	public CommonResponse<List<Integer>> deleteListKhachHang(@RequestBody @Valid final List<Integer> khachHangIdList) {
		CommonResponse<List<Integer>> response = new CommonResponse<>();
		try {
			response.successfulRespone(khachHangService.deleteKhachHang(khachHangIdList));
		} catch (Exception ex) {
			response.failedRespone(khachHangIdList, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<KhachHangDTO> getOneKhachHang(
			@RequestParam(value = "khachHang", required = true, defaultValue = "0") int khachHangID) {
		CommonResponse<KhachHangDTO> response = new CommonResponse<>();
		KhachHangDTO resultDTO = new KhachHangDTO();
		try {
			resultDTO = khachHangService.getKhachHangDTOById(khachHangID);
			response.successfulRespone(resultDTO);
		} catch (Exception ex) {
			response.failedRespone(resultDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<KhachHangDTO>> getKhachHang(
			@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "khachhangId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
//		log.debug("#### Recevied request to get all khach hang #######");
		CommonResponse<ListResponse<KhachHangDTO>> response = new CommonResponse<>();
		ListResponse<KhachHangDTO> results = khachHangService.getKhachHang(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
		response.successfulRespone(results);
		return response;
	}

}
