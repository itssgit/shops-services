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
import com.itss.shops.dto.NhanVienDTO;
import com.itss.shops.service.NhanVienService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/nhanvien")
public class NhanVienController {
	
	@Autowired
	NhanVienService nhanVienService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public CommonResponse<NhanVienDTO> addNhanVien(@RequestBody @Valid final NhanVienDTO nhanVienDTO) {
//		log.debug("### Recevied request to add new nhan vien");
		CommonResponse<NhanVienDTO> response = new CommonResponse<>();
		NhanVienDTO addDTO = new NhanVienDTO();
		try {
			addDTO = nhanVienService.addNhanVien(nhanVienDTO);
			response.successfulRespone(addDTO);
		} catch (Exception ex) {
			response.failedRespone(addDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public CommonResponse<NhanVienDTO> updateNhanVien(@RequestBody @Valid final NhanVienDTO nhanVienDTO) {
		CommonResponse<NhanVienDTO> response = new CommonResponse<>();
		NhanVienDTO updateDTO = new NhanVienDTO();
		try {
			updateDTO = nhanVienService.updateNhanVien(nhanVienDTO);
			response.successfulRespone(updateDTO);
		} catch (Exception ex) {
			response.failedRespone(updateDTO, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/deleteList", method = RequestMethod.DELETE, produces = "application/json")
	public CommonResponse<List<Integer>> deleteListNhanVien(@RequestBody @Valid final List<Integer> nhanVienIDList) {
		CommonResponse<List<Integer>> response = new CommonResponse<>();
		try {
			response.successfulRespone(nhanVienService.deleteNhanVien(nhanVienIDList));
		} catch (Exception ex) {
			response.failedRespone(nhanVienIDList, ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<NhanVienDTO> getOneNhanVien(@RequestParam(value = "nhanVienID", required = true, defaultValue = "0") int nhanVienID) {
		CommonResponse<NhanVienDTO> response = new CommonResponse<>();
		NhanVienDTO resultDTO = new NhanVienDTO();
		try {
			resultDTO = nhanVienService.getNhanVienDTOById(nhanVienID);
			response.successfulRespone(resultDTO);
		} catch (Exception ex) {
			throw new BadRequestException(ex.getMessage());
		}
		return response;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public CommonResponse<ListResponse<NhanVienDTO>> getNhanVien(@RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "nhanVienId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
//		log.debug("#### Recevied request to get all nhan vien #######");
		ListResponse<NhanVienDTO> results = nhanVienService.getNhanVien(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
		CommonResponse<ListResponse<NhanVienDTO>> response = new CommonResponse<>();
		response.successfulRespone(results);
		return response;
	}

}
