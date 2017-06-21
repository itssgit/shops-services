package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.itss.shops.common.entity.BaseEntity;
/**
 * DonHang generated by hbm2java
 */
@Entity
@Table(name = "DonHang", catalog = "Coffee")
public class DonHang extends BaseEntity {

	private Integer donHangId;
	private Date thoiGian;
	private float tongTien;
	private String ghiChu;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	private int banId;
	private int nhanVienId;

	public DonHang() {
	}

	public DonHang(Date thoiGian, float tongTien, String ghiChu, Date lastUpdate, int banId, int nhanVienId) {
		this.thoiGian = thoiGian;
		this.tongTien = tongTien;
		this.ghiChu = ghiChu;
		this.lastUpdate = lastUpdate;
		this.banId = banId;
		this.nhanVienId = nhanVienId;
	}

	public DonHang(Date thoiGian, float tongTien, String ghiChu, Date lastUpdate, Integer trangThaiXoa,
			Date thoiGianXoa, int banId, int nhanVienId) {
		this.thoiGian = thoiGian;
		this.tongTien = tongTien;
		this.ghiChu = ghiChu;
		this.lastUpdate = lastUpdate;
		this.trangThaiXoa = trangThaiXoa;
		this.thoiGianXoa = thoiGianXoa;
		this.banId = banId;
		this.nhanVienId = nhanVienId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "DonHangID", unique = true, nullable = false)
	public Integer getDonHangId() {
		return this.donHangId;
	}

	public void setDonHangId(Integer donHangId) {
		this.donHangId = donHangId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ThoiGian", nullable = false, length = 19)
	public Date getThoiGian() {
		return this.thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	@Column(name = "TongTien", nullable = false, precision = 12, scale = 0)
	public float getTongTien() {
		return this.tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	@Column(name = "GhiChu", nullable = false)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastUpdate", nullable = false, length = 19)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "TrangThaiXoa")
	public Integer getTrangThaiXoa() {
		return this.trangThaiXoa;
	}

	public void setTrangThaiXoa(Integer trangThaiXoa) {
		this.trangThaiXoa = trangThaiXoa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ThoiGianXoa", length = 19)
	public Date getThoiGianXoa() {
		return this.thoiGianXoa;
	}

	public void setThoiGianXoa(Date thoiGianXoa) {
		this.thoiGianXoa = thoiGianXoa;
	}

	@Column(name = "BanID", nullable = false)
	public int getBanId() {
		return this.banId;
	}

	public void setBanId(int banId) {
		this.banId = banId;
	}

	@Column(name = "NhanVienID", nullable = false)
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
