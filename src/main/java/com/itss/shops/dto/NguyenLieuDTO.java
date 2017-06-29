package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class NguyenLieuDTO extends BaseDTO {
    private Integer nguyenLieuId;
    private int soLuong;
    private String donVi;
    private String ten;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;

    public NguyenLieuDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getNguyenLieuId() {
        return nguyenLieuId;
    }

    public void setNguyenLieuId(Integer nguyenLieuId) {
        this.nguyenLieuId = nguyenLieuId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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


}
