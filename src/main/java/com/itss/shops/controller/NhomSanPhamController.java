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
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NhomSanPhamDTO;
import com.itss.shops.service.NhomSanPhamService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/nhomnguyenlieu")
public class NhomSanPhamController {
	
	@Autowired
	NhomSanPhamService nhomSanPhamService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public CommonResponse<NhomSanPhamDTO> addNhomSanPham(@RequestBody @Valid final NhomSanPhamDTO nhomSanPhamDTO) {
//		log.debug("### Recevied request to add new nhom san pham");
		CommonResponse<NhomSanPhamDTO> response = new CommonResponse<>();
		NhomSanPhamDTO addDTO = new NhomSanPhamDTO();
		try {
			addDTO = nhomSanPhamService.addNhomSanPham(nhomSanPhamDTO);
			response.successfulRespone(addDTO);
		} catch (Exception ex) {
			response.failedRespone(addDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public CommonResponse<NhomSanPhamDTO> updateNhomSanPham(@RequestBody @Valid final NhomSanPhamDTO nhomSanPhamDTO) {
		CommonResponse<NhomSanPhamDTO> response = new CommonResponse<>();
		NhomSanPhamDTO updateDTO = new NhomSanPhamDTO();
		try {
			updateDTO = nhomSanPhamService.updateNhomSanPham(nhomSanPhamDTO);
			response.successfulRespone(updateDTO);
		} catch (Exception ex) {
			response.failedRespone(updateDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteList", method = RequestMethod.DELETE, produces = "application/json")
	public CommonResponse<List<Integer>> deleteListNhomSanPham(@RequestBody @Valid final List<Integer> nhomSanPhamIdList) {
		CommonResponse<List<Integer>> response = new CommonResponse<>();
		try {
			response.successfulRespone(nhomSanPhamService.deleteNhomSanPham(nhomSanPhamIdList));
		} catch (Exception ex) {
			response.failedRespone(nhomSanPhamIdList, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<NhomSanPhamDTO> getOneNhomSanPham(@RequestParam(value = "nhomSanPhamID", required = true, defaultValue = "0") int nhomSanphamID) {
		CommonResponse<NhomSanPhamDTO> response = new CommonResponse<>();
		NhomSanPhamDTO resultDTO = new NhomSanPhamDTO();
		try {
			resultDTO = nhomSanPhamService.getNhomSanPhamDTOById(nhomSanphamID);
			response.successfulRespone(resultDTO);
		} catch (Exception ex) {
			throw new BadRequestException(ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<NhomSanPhamDTO>> getNhomSanPham(
			@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "nhomSanPhamId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
		//log.debug("#### Recevied request to get all nhom san pham #######");
		ListResponse<NhomSanPhamDTO> results = nhomSanPhamService.getNhomSanPham(pageNum, pageSize, sortBy, sortOrder, 
				isShowInactive, searchText);
		CommonResponse<ListResponse<NhomSanPhamDTO>> response = new CommonResponse<>();
		response.successfulRespone(results);
		return response;
	}

}
