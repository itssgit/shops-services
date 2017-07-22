package com.itss.shops.controller;

import com.itss.shops.common.model.CommonResponse;
import com.itss.shops.dto.ChiTietDonHangDTO;
import com.itss.shops.service.ChiTietDonHangService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/chitietdonhang")
public class ChiTietDonHangController {

    @Autowired
    ChiTietDonHangService chiTietDonHangService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json", consumes = "*/*")
    public CommonResponse<String> test() {
        CommonResponse<String> response = new CommonResponse<String>();

        response.successfulRespone("OK");
        return response;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public CommonResponse<ChiTietDonHangDTO> addChiTietDonHang(@RequestBody @Valid final ChiTietDonHangDTO chiTietDonHangDTO) {
        CommonResponse<ChiTietDonHangDTO> response = new CommonResponse<>();
        ChiTietDonHangDTO addedDTO = new ChiTietDonHangDTO();
        try {
            addedDTO = chiTietDonHangService.addChiTietDonHang(chiTietDonHangDTO);
            response.successfulRespone(addedDTO);
        } catch (Exception ex) {
            response.failedRespone(addedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<Integer> deleteChiTietDonHang(@RequestBody @Valid final Integer chiTietDonHangId) {
        CommonResponse<Integer> response = new CommonResponse<>();

        try {
            response.successfulRespone(chiTietDonHangService.deleteChiTietDonHang(chiTietDonHangId));
        } catch (Exception ex) {
            response.failedRespone(chiTietDonHangId, ex.getMessage());
        }

        return response;
    }

//    @RequestMapping(value = "/deleteList", method = RequestMethod.PUT, produces = "application/json")
//    public CommonResponse<List<Integer>> deleteListChiTietDonHang(@RequestBody @Valid final List<Integer> chiTietDonHangIdList) {
//        CommonResponse<List<Integer>> response = new CommonResponse<>();
//
//        try {
//            response.successfulRespone(chiTietDonHangService.deleteListChiTietDonHang(chiTietDonHangIdList));
//        } catch (Exception ex) {
//            response.failedRespone(chiTietDonHangIdList, ex.getMessage());
//        }
//
//        return response;
//    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
    public CommonResponse<ChiTietDonHangDTO> updateChiTietDonHang(@RequestBody @Valid final ChiTietDonHangDTO chiTietDonHangDTO) {
        CommonResponse<ChiTietDonHangDTO> response = new CommonResponse<>();
        ChiTietDonHangDTO updatedDTO = new ChiTietDonHangDTO();
        try {
            updatedDTO = chiTietDonHangService.updateChiTietDonHang(chiTietDonHangDTO);
            response.successfulRespone(updatedDTO);
        } catch (Exception ex) {
            response.failedRespone(updatedDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<ChiTietDonHangDTO> getCiTietDonHang(@RequestParam(value = "chiTietDonHangID", required = true, defaultValue = "0") int chitietdonhangID) {
        CommonResponse<ChiTietDonHangDTO> response = new CommonResponse<>();
        ChiTietDonHangDTO resultDTO = new ChiTietDonHangDTO();
        try {
            resultDTO = chiTietDonHangService.getChiTietDonHangDTOById(chitietdonhangID);
            response.successfulRespone(resultDTO);
        } catch (Exception ex) {
            response.failedRespone(resultDTO, ex.getMessage());
        }

        return response;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public CommonResponse<List<ChiTietDonHangDTO>> getChiTietDonHang(@RequestParam(value = "donHangID", required = true, defaultValue = "0") int donhangID ){
        //		log.debug("Received request to list users");
        List<ChiTietDonHangDTO> results = chiTietDonHangService.getListChiTietDonHangDTOByDonHangId(donhangID);
        CommonResponse<List<ChiTietDonHangDTO>> response = new CommonResponse<List<ChiTietDonHangDTO>>();
        response.successfulRespone(results);

        return response;
    }

}
