package com.itss.shops.controller;

import com.itss.shops.common.constant.Constants;
import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.service.DonHangService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@Slf4j
@RequestMapping("/donhang")
public class DonHangController {

    @Autowired
    DonHangService donHangService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
    public CommonResponse<String> test() {
        CommonResponse<String> response = new CommonResponse<String>();

        response.successfulRespone("OK");
        return response;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<DonHangDTO> addDonHang(@RequestBody @Valid final DonHangDTO donHangDTO) {
        CommonResponse<DonHangDTO> response = new CommonResponse<>();
        DonHangDTO addedDTO = new DonHangDTO();
        try {
            addedDTO = donHangService.addDonHang(donHangDTO);
            response.successfulRespone(addedDTO);
        } catch (Exception ex) {
            response.failedRespone(addedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<Integer> deleteDonHang(@RequestBody @Valid final Integer donHangId) {
        CommonResponse<Integer> response = new CommonResponse<>();

        try {
            response.successfulRespone(donHangService.deleteDonHang(donHangId));
        } catch (Exception ex) {
            response.failedRespone(donHangId, ex.getMessage());
        }

        return response;
    }

//    @RequestMapping(value = "/deleteList", method = RequestMethod.PUT, produces = "application/json")
//    public CommonResponse<List<Integer>> deleteListDonHang(@RequestBody @Valid final List<Integer> donHangIdList) {
//        CommonResponse<List<Integer>> response = new CommonResponse<>();
//
//        try {
//            response.successfulRespone(donHangService.deleteListDonHang(donHangIdList));
//        } catch (Exception ex) {
//            response.failedRespone(donHangIdList, ex.getMessage());
//        }
//
//        return response;
//    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<DonHangDTO> updateDonHang(@RequestBody @Valid final DonHangDTO donHangDTO) {
        CommonResponse<DonHangDTO> response = new CommonResponse<>();
        DonHangDTO updatedDTO = new DonHangDTO();
        try {
            updatedDTO = donHangService.updateDonHang(donHangDTO);
            response.successfulRespone(updatedDTO);
        } catch (Exception ex) {
            response.failedRespone(updatedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<DonHangDTO> getUsers(@RequestParam(value = "donHangID", required = true, defaultValue = "0") int donhangID) {
        CommonResponse<DonHangDTO> response = new CommonResponse<>();
        DonHangDTO resultDTO = new DonHangDTO();
        try {
            resultDTO = donHangService.getDonHangDTOById(donhangID);
            response.successfulRespone(resultDTO);
        } catch (Exception ex) {
            response.failedRespone(resultDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<ListResponse<DonHangDTO>> getDonHang(
            @RequestParam(value = "pageNum", required = false, defaultValue = Constants.PAGE_DEFAULT_START) int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = Constants.PAGE_DEFAULT_LIMIT) int pageSize,
            @RequestParam(value = "sortBy", required = false, defaultValue = "donHangId") String sortBy,
            @RequestParam(value = "sortOrder", required = false, defaultValue = Constants.DESCENDING) String sortOrder,
            @RequestParam(value = "isShowInactive", required = false, defaultValue = "false") Boolean isShowInactive,
            @RequestParam(value = "searchText", required = false) String searchText) {
        //		log.debug("Received request to list users");
        ListResponse<DonHangDTO> results = donHangService.getDonHang(pageNum, pageSize, sortBy,
                sortOrder, isShowInactive, searchText);
        CommonResponse<ListResponse<DonHangDTO>> response = new CommonResponse<ListResponse<DonHangDTO>>();
        response.successfulRespone(results);

        return response;
    }

}
