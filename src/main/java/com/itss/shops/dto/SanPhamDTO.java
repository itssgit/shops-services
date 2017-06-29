package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

import java.util.Date;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class SanPhamDTO extends BaseDTO {
    private Integer sanPhamId;
    private Integer nhomSanPhamId;
    private float donGia;
    private String tenSanPham;
    private String moTa;
    private String hinhAnh;
    private boolean hienThi;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;

    private List<ChiTietSanPhamDTO> chiTietSanPhamDTOList;

    public SanPhamDTO() {
        super();
    }

    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public Integer getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(Integer sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    public Integer getNhomSanPhamId() {
        return nhomSanPhamId;
    }

    public void setNhomSanPhamId(Integer nhomSanPhamId) {
        this.nhomSanPhamId = nhomSanPhamId;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public boolean isHienThi() {
        return hienThi;
    }

    public void setHienThi(boolean hienThi) {
        this.hienThi = hienThi;
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

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public List<ChiTietSanPhamDTO> getChiTietSanPhamDTOList() {
        return chiTietSanPhamDTOList;
    }

    public void setChiTietSanPhamDTOList(List<ChiTietSanPhamDTO> chiTietSanPhamDTOList) {
        this.chiTietSanPhamDTOList = chiTietSanPhamDTOList;
    }


}
