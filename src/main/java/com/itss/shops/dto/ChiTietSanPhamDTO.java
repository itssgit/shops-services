package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class ChiTietSanPhamDTO extends BaseDTO {
    private Integer chiTietSanPhamId;
    private int sanPhamId;
    private int nguyenLieuId;
    private int soLuong;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;
    private NguyenLieuDTO nguyenLieuDTO;

    public ChiTietSanPhamDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getChiTietSanPhamId() {
        return chiTietSanPhamId;
    }

    public void setChiTietSanPhamId(Integer chiTietSanPhamId) {
        this.chiTietSanPhamId = chiTietSanPhamId;
    }

    public int getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(int sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    public int getNguyenLieuId() {
        return nguyenLieuId;
    }

    public void setNguyenLieuId(int nguyenLieuId) {
        this.nguyenLieuId = nguyenLieuId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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

    public NguyenLieuDTO getNguyenLieuDTO() {
        return nguyenLieuDTO;
    }

    public void setNguyenLieuDTO(NguyenLieuDTO nguyenLieuDTO) {
        this.nguyenLieuDTO = nguyenLieuDTO;
    }
}
