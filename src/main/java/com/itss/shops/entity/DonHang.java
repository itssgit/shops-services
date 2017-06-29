package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import com.itss.shops.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * DonHang generated by hbm2java
 */
@Entity
@Table(name = "donhang")
public class DonHang extends BaseEntity {

    private Integer donHangId;
    private Date thoiGian;
    private float tongTien;
    private String ghiChu;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;
    private int banId;
    private int nhanVienId;

    public DonHang() {
    }

    public DonHang(Date thoiGian, float tongTien, String ghiChu, int banId, int nhanVienId) {
        this.thoiGian = thoiGian;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.banId = banId;
        this.nhanVienId = nhanVienId;
    }

    public DonHang(Date thoiGian, float tongTien, String ghiChu, Integer trangThaiXoa,
                   Date thoiGianXoa, int banId, int nhanVienId) {
        this.thoiGian = thoiGian;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.trangThaiXoa = trangThaiXoa;
        this.thoiGianXoa = thoiGianXoa;
        this.banId = banId;
        this.nhanVienId = nhanVienId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "donhang_id", unique = true, nullable = false)
    public Integer getDonHangId() {
        return this.donHangId;
    }

    public void setDonHangId(Integer donHangId) {
        this.donHangId = donHangId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "thoigian", nullable = false, length = 19)
    public Date getThoiGian() {
        return this.thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Column(name = "tongtien", nullable = false, precision = 12, scale = 0)
    public float getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    @Column(name = "ghichu", nullable = false)
    public String getGhiChu() {
        return this.ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Column(name = "trangthai_xoa")
    public Integer getTrangThaiXoa() {
        return this.trangThaiXoa;
    }

    public void setTrangThaiXoa(Integer trangThaiXoa) {
        this.trangThaiXoa = trangThaiXoa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "thoigian_xoa", length = 19)
    public Date getThoiGianXoa() {
        return this.thoiGianXoa;
    }

    public void setThoiGianXoa(Date thoiGianXoa) {
        this.thoiGianXoa = thoiGianXoa;
    }

    @Column(name = "ban_id", nullable = false)
    public int getBanId() {
        return this.banId;
    }

    public void setBanId(int banId) {
        this.banId = banId;
    }

    @Column(name = "nhanvien_id", nullable = false)
    public int getNhanVienId() {
        return this.nhanVienId;
    }

    public void setNhanVienId(int nhanVienId) {
        this.nhanVienId = nhanVienId;
    }

    /**
     *
     */
    private static final long serialVersionUID = 5661907468559094787L;

}
