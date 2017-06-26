package com.itss.shops.service.Impl;

import com.itss.shops.dto.ChiTietSanPhamDTO;
import com.itss.shops.repository.ChiTietSanPhamRepository;
import com.itss.shops.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public ChiTietSanPhamDTO addChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        return chiTietSanPhamRepository.addChiTietSanPham(chiTietSanPhamDTO);
    }

    @Override
    public List<ChiTietSanPhamDTO> addListChiTietSanPham(List<ChiTietSanPhamDTO> listChiTietSanPhamDTO) {
        List<ChiTietSanPhamDTO>  result = new ArrayList<>();

        for (ChiTietSanPhamDTO tmpDTO : listChiTietSanPhamDTO) {
            ChiTietSanPhamDTO addedDTO = this.addChiTietSanPham(tmpDTO);
            if (addedDTO.getChiTietSanPhamId() != null) {
                result.add(addedDTO);
            }
        }

        return result;
    }

    @Override
    public ChiTietSanPhamDTO updateChiTietSanPham(ChiTietSanPhamDTO chiTietSanPhamDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ChiTietSanPhamDTO> updateListChiTietSanPham(List<ChiTietSanPhamDTO> chiTietSanPhamDTOs) {
        List<ChiTietSanPhamDTO> listDTO = new ArrayList<>();
        for(ChiTietSanPhamDTO tmpDTO : chiTietSanPhamDTOs){

            ChiTietSanPhamDTO updatedDTO = this.updateChiTietSanPham(tmpDTO);
            listDTO.add(updatedDTO);
        }
        return listDTO;
    }

    @Override
    public Integer deleteChiTietSanPham(Integer chiTietSanPhamID) {
        return chiTietSanPhamRepository.deleteChiTietSanPhamById(chiTietSanPhamID);
    }

    @Override
    public Integer deleteChiTietSanPhamBySanPhamID(Integer sanPhamID) {
        List<ChiTietSanPhamDTO> chiTietSanPhamDTOList = this.getListChiTietSanPhamDTOBySanPhamId(sanPhamID);
        if(chiTietSanPhamDTOList != null) {
            for (ChiTietSanPhamDTO tmpDTO : chiTietSanPhamDTOList) {
                this.deleteChiTietSanPham(tmpDTO.getChiTietSanPhamId());
            }
        }
        return chiTietSanPhamDTOList.size();
    }

    @Override
    public List<ChiTietSanPhamDTO> getListChiTietSanPhamDTOBySanPhamId(Integer sanPhamID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<ChiTietSanPhamDTO> getChiTietSanPhamDTOById(Integer chiTietSanPhamID) {
        // TODO Auto-generated method stub
        return null;
    }


}
