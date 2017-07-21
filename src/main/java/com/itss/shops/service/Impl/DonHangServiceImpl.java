package com.itss.shops.service.Impl;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.common.model.ListResponse;
import com.itss.shops.dto.ChiTietDonHangDTO;
import com.itss.shops.dto.DonHangDTO;
import com.itss.shops.dto.HangKhuyenMaiDTO;
import com.itss.shops.dto.PhieuNhapDTO;
import com.itss.shops.repository.DonHangRepository;
import com.itss.shops.service.ChiTietDonHangService;
import com.itss.shops.service.DonHangService;
import com.itss.shops.service.HangKhuyenMaiService;
import com.itss.shops.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangServiceImpl implements DonHangService {

    @Autowired
    private DonHangRepository donHangRepository;

    @Autowired
    private ChiTietDonHangService chiTietDonHangService;

    @Autowired
    private HangKhuyenMaiService hangKhuyenMaiService;
    
    @Override
    public DonHangDTO addDonHang(DonHangDTO donHangDTO) {
        if (donHangDTO.getDonHangId() == null || donHangDTO.getDonHangId() == 0) {
            donHangDTO.setDonHangId(null);

            //add donhang de lay id
            DonHangDTO resultDTO = donHangRepository.addDonHang(donHangDTO);

            //add chitietdonhang
            List<ChiTietDonHangDTO> chiTietDonHangDTOList =
                    chiTietDonHangService.addListChiTietDonHang(donHangDTO.getChiTietDonHangDTOList(), resultDTO.getDonHangId());
            resultDTO.setChiTietDonHangDTOList(chiTietDonHangDTOList);

            //add hangkhuyenmai
            List<HangKhuyenMaiDTO> hangKhuyenMaiDTOList = hangKhuyenMaiService.addListHangKhuyenMaiDTO(donHangDTO.getHangKhuyenMaiDTOList(), resultDTO.getDonHangId());
            resultDTO.setHangKhuyenMaiDTOList(hangKhuyenMaiDTOList);


            return resultDTO;
        } else throw new BadRequestException();
    }

    @Override
    public DonHangDTO updateDonHang(DonHangDTO donHangDTO) {
        //update don hang

        //update chitietdonhang

        //update hangkhuyenmai

        return null;
    }

    @Override
    public Integer deleteDonHang(Integer donhangID) {
        //delete donhang

        return null;
    }

    @Override
    public DonHangDTO getDonHangDTOById(Integer donhangID) {
        DonHangDTO resultDTO = donHangRepository.getDonHangDTOById(donhangID);
        resultDTO.setChiTietDonHangDTOList(chiTietDonHangService.getListChiTietDonHangDTOByDonHangId(donhangID));
        resultDTO.setHangKhuyenMaiDTOList(hangKhuyenMaiService.getListHangKhuyenMaiDTOByDonHangId(donhangID));
        return resultDTO;
    }

    @Override
    public ListResponse<DonHangDTO> getDonHang(int pageNum, int pageSize, String sortBy, String sortOrder, Boolean isShowInactive, String searchText) {
        List<DonHangDTO> listDTO = donHangRepository.getDonHang(pageNum, pageSize, sortBy, sortOrder, isShowInactive, searchText);
        if (!listDTO.isEmpty()) {
            for (DonHangDTO tmpDTO : listDTO) {
                tmpDTO.setChiTietDonHangDTOList(chiTietDonHangService.getListChiTietDonHangDTOByDonHangId(tmpDTO.getDonHangId()));
                tmpDTO.setHangKhuyenMaiDTOList(hangKhuyenMaiService.getListHangKhuyenMaiDTOByDonHangId(tmpDTO.getDonHangId()));
            }
        }

        ListResponse<DonHangDTO> response = new ListResponse<>();
        response.setList(listDTO);
        response.setTotalCount(Long.valueOf(listDTO.size()));

        return response;
    }
}
