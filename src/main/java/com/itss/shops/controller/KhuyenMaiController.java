package com.itss.shops.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.KhuyenMaiDTO;
import com.itss.shops.service.KhuyenMaiService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/khuyenmai")
@PreAuthorize("hasRole('ADMIN')")
public class KhuyenMaiController {
	
	@Autowired
	KhuyenMaiService khuyenMaiService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public CommonResponse<KhuyenMaiDTO> addKhuyenMai(@RequestBody @Valid final KhuyenMaiDTO khuyenMaiDTO) {
//		log.debug("### Recevied request to add new khuyen mai");
		CommonResponse<KhuyenMaiDTO> response = new CommonResponse<>();
		KhuyenMaiDTO addDTO = new KhuyenMaiDTO();
		try {
			addDTO = khuyenMaiService.addKhuyenMai(khuyenMaiDTO);
			response.successfulRespone(addDTO);
		} catch(Exception ex) {
			response.failedRespone(addDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public CommonResponse<KhuyenMaiDTO> updateKhuyenMai(@RequestBody @Valid final KhuyenMaiDTO khuyenMaiDTO) {
		CommonResponse<KhuyenMaiDTO> response = new CommonResponse<>();
		KhuyenMaiDTO updateDTO = new KhuyenMaiDTO();
		try {
			updateDTO = khuyenMaiService.updateKhuyenMai(khuyenMaiDTO);
			response.successfulRespone(updateDTO);
		} catch (Exception ex) {
			response.failedRespone(updateDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteList", method = RequestMethod.DELETE, produces = "application/json")
	public CommonResponse<List<Integer>> deleteListKhuyenMai(@RequestBody @Valid final List<Integer> khuyenMaiIDList) {
		CommonResponse<List<Integer>> response = new CommonResponse<>();
		try {
			response.successfulRespone(khuyenMaiService.deleteKhuyenMai(khuyenMaiIDList));
		} catch (Exception ex) {
			response.failedRespone(khuyenMaiIDList, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<KhuyenMaiDTO> getOneKhuyenMai(@RequestParam(value = "khuyenMaiID", required = true, defaultValue = "0") int khuyenMaiID) {
		CommonResponse<KhuyenMaiDTO> response = new CommonResponse<>();
		KhuyenMaiDTO resultDTO = new KhuyenMaiDTO();
		try {
			resultDTO = khuyenMaiService.getKhuyenMaiDTOById(khuyenMaiID);
			response.successfulRespone(resultDTO);
		} catch (Exception ex) {
			throw new BadRequestException(ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<KhuyenMaiDTO>> getKhuyenMai(@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "khuyenMaiId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
//		log.debug("#### Recevied request to get all khuyen mai #######");
		ListResponse<KhuyenMaiDTO> results = khuyenMaiService.getKhuyenMai(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
		CommonResponse<ListResponse<KhuyenMaiDTO>> response = new CommonResponse<>();
		response.successfulRespone(results);
		return response;
	}

}
