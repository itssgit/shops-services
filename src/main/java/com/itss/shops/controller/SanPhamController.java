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
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.SanPhamDTO;
import com.itss.shops.service.SanPhamService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/sanpham")
@PreAuthorize("hasRole('ADMIN')")
public class SanPhamController {

    @Autowired
    SanPhamService sanPhamService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
    public CommonResponse<String> test() {
        CommonResponse<String> response = new CommonResponse<String>();

        response.successfulRespone("OK");
        return response;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<SanPhamDTO> addSanPham(@RequestBody @Valid final SanPhamDTO sanPhamDTO) {
        CommonResponse<SanPhamDTO> response = new CommonResponse<>();
        SanPhamDTO addedDTO = new SanPhamDTO();
        try {
            addedDTO = sanPhamService.addSanPham(sanPhamDTO);
            response.successfulRespone(addedDTO);
        } catch (Exception ex) {
            response.failedRespone(addedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<Integer> deleteSanPham(@RequestBody @Valid final Integer sanPhamId) {
        CommonResponse<Integer> response = new CommonResponse<>();

        try {
            response.successfulRespone(sanPhamService.deleteSanPham(sanPhamId));
        } catch (Exception ex) {
            response.failedRespone(sanPhamId, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/deleteList", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<List<Integer>> deleteListSanPham(@RequestBody @Valid final List<Integer> sanPhamIdList) {
        CommonResponse<List<Integer>> response = new CommonResponse<>();

        try {
            response.successfulRespone(sanPhamService.deleteListSanPham(sanPhamIdList));
        } catch (Exception ex) {
            response.failedRespone(sanPhamIdList, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<SanPhamDTO> updateSanPham(@RequestBody @Valid final SanPhamDTO sanPhamDTO) {
        CommonResponse<SanPhamDTO> response = new CommonResponse<>();
        SanPhamDTO updatedDTO = new SanPhamDTO();
        try {
            updatedDTO = sanPhamService.updateSanPham(sanPhamDTO);
            response.successfulRespone(updatedDTO);
        } catch (Exception ex) {
            response.failedRespone(updatedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<SanPhamDTO> getUsers(@RequestParam(value = "sanPhamID", required = true, defaultValue = "0") int sanphamID) {
        CommonResponse<SanPhamDTO> response = new CommonResponse<>();
        SanPhamDTO resultDTO = new SanPhamDTO();
        try {
            resultDTO = sanPhamService.getSanPhamDTOById(sanphamID);
            response.successfulRespone(resultDTO);
        } catch (Exception ex) {
            response.failedRespone(resultDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<ListResponse<SanPhamDTO>> getSanPham(
            @RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "sanPhamId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
        //		log.debug("Received request to list users");
        ListResponse<SanPhamDTO> results = sanPhamService.getSanPham(pageNum, pageSize, sortBy,
                sortOrder, isShowInactive, searchText);
        CommonResponse<ListResponse<SanPhamDTO>> response = new CommonResponse<ListResponse<SanPhamDTO>>();
        response.successfulRespone(results);

        return response;
    }

}
