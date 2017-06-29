package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import com.itss.shops.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * HangKhuyenMai generated by hbm2java
 */
@Entity
@Table(name = "hang_khuyenmai", uniqueConstraints = @UniqueConstraint(columnNames = {"khuyenmai_id",
        "donhang_id"}))
public class HangKhuyenMai extends BaseEntity {

    private Integer hangKhuyenMaiId;
    private Integer trangThaiXoa;
    private Date thoiGianXoa;
    private int khuyenMaiId;
    private int donHangId;

    public HangKhuyenMai() {
    }

    public HangKhuyenMai(int khuyenMaiId, int donHangId) {
        this.khuyenMaiId = khuyenMaiId;
        this.donHangId = donHangId;
    }

    public HangKhuyenMai(Integer trangThaiXoa, Date thoiGianXoa, int khuyenMaiId, int donHangId) {
        this.trangThaiXoa = trangThaiXoa;
        this.thoiGianXoa = thoiGianXoa;
        this.khuyenMaiId = khuyenMaiId;
        this.donHangId = donHangId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "hang_khuyenmai_id", unique = true, nullable = false)
    public Integer getHangKhuyenMaiId() {
        return this.hangKhuyenMaiId;
    }

    public void setHangKhuyenMaiId(Integer hangKhuyenMaiId) {
        this.hangKhuyenMaiId = hangKhuyenMaiId;
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

    @Column(name = "khuyenmai_id", nullable = false)
    public int getKhuyenMaiId() {
        return this.khuyenMaiId;
    }

    public void setKhuyenMaiId(int khuyenMaiId) {
        this.khuyenMaiId = khuyenMaiId;
    }

    @Column(name = "donhang_id", nullable = false)
    public int getDonHangId() {
        return this.donHangId;
    }

    public void setDonHangId(int donHangId) {
        this.donHangId = donHangId;
    }

    /**
     *
     */
    private static final long serialVersionUID = 3277804163210630709L;

}
