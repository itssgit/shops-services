package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

import java.util.Date;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class PhieuNhapDTO extends BaseDTO {
    private Integer phieuNhapId;
    private Date ngayNhap;
    private float tongGiaTri;
    private int nhanVienId;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;
    private List<ChiTietNhapHangDTO> chiTietNhapHangDTOList;

    public PhieuNhapDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getPhieuNhapId() {
        return phieuNhapId;
    }

    public void setPhieuNhapId(Integer phieuNhapId) {
        this.phieuNhapId = phieuNhapId;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(float tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public int getNhanVienId() {
        return nhanVienId;
    }

    public void setNhanVienId(int nhanVienId) {
        this.nhanVienId = nhanVienId;
    }

    public Integer getTrangThaiXoa() {
        return trangThaiXoa;
    }

    public void setTrangThaiXoa(Integer trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    public Date getThoiGianXoa() {
        return thoiGianXoa;
    }

    public void setThoiGianXoa(Date thoiGianXoa) {
        this.thoiGianXoa = thoiGianXoa;
    }

    public List<ChiTietNhapHangDTO> getChiTietNhapHangDTOList() {
        return chiTietNhapHangDTOList;
    }

    public void setChiTietNhapHangDTOList(List<ChiTietNhapHangDTO> chiTietNhapHangDTOList) {
        this.chiTietNhapHangDTOList = chiTietNhapHangDTOList;
    }
}
