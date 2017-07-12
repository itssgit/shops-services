package com.itss.shops.controller;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.dto.NguyenLieuDTO;
import com.itss.shops.service.NguyenLieuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/nguyenlieu")
public class NguyenLieuController {

    @Autowired
    NguyenLieuService nguyenLieuService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
    public CommonResponse<String> test() {
        CommonResponse<String> response = new CommonResponse<String>();

        response.successfulRespone("OK");
        return response;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<NguyenLieuDTO> addNguyenLieu(@RequestBody @Valid final NguyenLieuDTO nguyenLieuDTO) {
        CommonResponse<NguyenLieuDTO> response = new CommonResponse<>();
        NguyenLieuDTO addedDTO = new NguyenLieuDTO();
        try {
            addedDTO = nguyenLieuService.addNguyenLieu(nguyenLieuDTO);
            response.successfulRespone(addedDTO);
        } catch (Exception ex) {
            response.failedRespone(addedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/createList", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<List<NguyenLieuDTO>> addListNguyenLieu(@RequestBody @Valid final List<NguyenLieuDTO> nguyenLieuDTOList) {
        CommonResponse<List<NguyenLieuDTO>> response = new CommonResponse<>();
        List<NguyenLieuDTO> addedDTOs = new ArrayList<>();
        try {
            addedDTOs = nguyenLieuService.addListNguyenLieu(nguyenLieuDTOList);
            response.successfulRespone(addedDTOs);
        } catch (Exception ex) {
            response.failedRespone(addedDTOs, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<NguyenLieuDTO> updateNguyenLieu(@RequestBody @Valid final NguyenLieuDTO nguyenLieuDTO) {
        CommonResponse<NguyenLieuDTO> response = new CommonResponse<>();
        NguyenLieuDTO updatedDTO = new NguyenLieuDTO();
        try {
            updatedDTO = nguyenLieuService.updateNguyenLieu(nguyenLieuDTO);
            response.successfulRespone(updatedDTO);
        } catch (Exception ex) {
            response.failedRespone(updatedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/deleteList", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<List<Integer>> deleteListNguyenLieu(@RequestBody @Valid final List<Integer> listNguyenLieuId) {
        CommonResponse<List<Integer>> response = new CommonResponse<>();
        List<Integer> listDeleted = new ArrayList<>();
        try {
            listDeleted = nguyenLieuService.deleteListNguyenLieu(listNguyenLieuId);
            response.successfulRespone(listDeleted);
        } catch (Exception ex) {
            response.failedRespone(listDeleted, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<NguyenLieuDTO> getUsers(@RequestParam(value = "nguyenLieuId", required = true, defaultValue = "0") int nguyenLieuId) {
        CommonResponse<NguyenLieuDTO> response = new CommonResponse<>();
        NguyenLieuDTO resultDTO = new NguyenLieuDTO();
        try {
            resultDTO = nguyenLieuService.getNguyenLieuDTOById(nguyenLieuId);
            response.successfulRespone(resultDTO);
        } catch (Exception ex) {
            response.failedRespone(resultDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<ListResponse<NguyenLieuDTO>> getNguyenLieu(
            @RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "nguyenLieuId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
        ListResponse<NguyenLieuDTO> results = nguyenLieuService.getNguyenLieu(pageNum, pageSize, sortBy,
                sortOrder, isShowInactive, searchText);
        CommonResponse<ListResponse<NguyenLieuDTO>> response = new CommonResponse<ListResponse<NguyenLieuDTO>>();
        response.successfulRespone(results);

        return response;
    }



}
