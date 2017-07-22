package com.itss.shops.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;
import com.itss.shops.entity.HangKhuyenMai;

import java.util.Date;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class DonHangDTO extends BaseDTO {
    private Integer donHangId;
    private int trangThai;
    private Date thoiGian;
    private float tongTien;
    private String ghiChu;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;
    private int banId;
    private int nhanVienId;


    private BanDTO banDTO;
    private NhanVienDTO nhanVienDTO;
    private List<HangKhuyenMaiDTO> hangKhuyenMaiDTOList;
    private List<ChiTietDonHangDTO> chiTietDonHangDTOList;



    /**
     *
     */
    private static final long serialVersionUID = 16207331533605865L;

    public DonHangDTO() {
        super();
    }

    public Integer getDonHangId() {
        return donHangId;
    }

    public void setDonHangId(Integer donHangId) {
        this.donHangId = donHangId;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getBanId() {
        return banId;
    }

    public void setBanId(int banId) {
        this.banId = banId;
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

    public List<HangKhuyenMaiDTO> getHangKhuyenMaiDTOList() {
        return hangKhuyenMaiDTOList;
    }

    public void setHangKhuyenMaiDTOList(List<HangKhuyenMaiDTO> hangKhuyenMaiDTOList) {
        this.hangKhuyenMaiDTOList = hangKhuyenMaiDTOList;
    }

    public BanDTO getBanDTO() {
        return banDTO;
    }

    public void setBanDTO(BanDTO banDTO) {
        this.banDTO = banDTO;
    }

    public NhanVienDTO getNhanVienDTO() {
        return nhanVienDTO;
    }

    public void setNhanVienDTO(NhanVienDTO nhanVienDTO) {
        this.nhanVienDTO = nhanVienDTO;
    }

    public List<ChiTietDonHangDTO> getChiTietDonHangDTOList() {
        return chiTietDonHangDTOList;
    }

    public void setChiTietDonHangDTOList(List<ChiTietDonHangDTO> chiTietDonHangDTOList) {
        this.chiTietDonHangDTOList = chiTietDonHangDTOList;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
