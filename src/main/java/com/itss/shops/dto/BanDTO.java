package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class BanDTO extends BaseDTO {

    private Integer banId;
    private String maSo;
    private int trangThai;
    private Integer ghepBanBanId;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;

    public BanDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getBanId() {
        return banId;
    }

    public void setBanId(Integer banId) {
        this.banId = banId;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getGhepBanBanId() {
        return ghepBanBanId;
    }

    public void setGhepBanBanId(Integer ghepBanBanId) {
        this.ghepBanBanId = ghepBanBanId;
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
