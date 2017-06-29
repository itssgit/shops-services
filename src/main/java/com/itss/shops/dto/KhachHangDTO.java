package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;
import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class KhachHangDTO implements Serializable {
    private Integer khachhangId;
    private String maKhachhang;
    private String tenKhachhang;
    private String sdt;
    private String email;
    private byte gioitinh;
    private String diachi;
    private int diemTichluy;
    private int congno;
    private int trangthai;
    private Integer trangthaiXoa;
    private Date thoigianXoa;

    public KhachHangDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getKhachhangId() {
        return khachhangId;
    }

    public void setKhachhangId(Integer khachhangId) {
        this.khachhangId = khachhangId;
    }

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getTenKhachhang() {
        return tenKhachhang;
    }

    public void setTenKhachhang(String tenKhachhang) {
        this.tenKhachhang = tenKhachhang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(byte gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getDiemTichluy() {
        return diemTichluy;
    }

    public void setDiemTichluy(int diemTichluy) {
        this.diemTichluy = diemTichluy;
    }

    public int getCongno() {
        return congno;
    }

    public void setCongno(int congno) {
        this.congno = congno;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Integer getTrangthaiXoa() {
        return trangthaiXoa;
    }

    public void setTrangthaiXoa(Integer trangthaiXoa) {
        this.trangthaiXoa = trangthaiXoa;
    }

    public Date getThoigianXoa() {
        return thoigianXoa;
    }

    public void setThoigianXoa(Date thoigianXoa) {
        this.thoigianXoa = thoigianXoa;
    }
}
