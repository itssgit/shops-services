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
import javax.persistence.UniqueConstraint;
import com.itss.shops.common.entity.BaseEntity;
/**
 * HangKhuyenMai generated by hbm2java
 */
@Entity
@Table(name = "HangKhuyenMai", catalog = "Coffee", uniqueConstraints = @UniqueConstraint(columnNames = { "KhuyenMaiID",
		"DonHangID" }))
public class HangKhuyenMai extends BaseEntity {

	private Integer hangKhuyenMaiId;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	private int khuyenMaiId;
	private int donHangId;

	public HangKhuyenMai() {
	}

	public HangKhuyenMai(Date lastUpdate, int khuyenMaiId, int donHangId) {
		this.lastUpdate = lastUpdate;
		this.khuyenMaiId = khuyenMaiId;
		this.donHangId = donHangId;
	}

	public HangKhuyenMai(Date lastUpdate, Integer trangThaiXoa, Date thoiGianXoa, int khuyenMaiId, int donHangId) {
		this.lastUpdate = lastUpdate;
		this.trangThaiXoa = trangThaiXoa;
		this.thoiGianXoa = thoiGianXoa;
		this.khuyenMaiId = khuyenMaiId;
		this.donHangId = donHangId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "HangKhuyenMaiID", unique = true, nullable = false)
	public Integer getHangKhuyenMaiId() {
		return this.hangKhuyenMaiId;
	}

	public void setHangKhuyenMaiId(Integer hangKhuyenMaiId) {
		this.hangKhuyenMaiId = hangKhuyenMaiId;
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

	@Column(name = "KhuyenMaiID", nullable = false)
	public int getKhuyenMaiId() {
		return this.khuyenMaiId;
	}

	public void setKhuyenMaiId(int khuyenMaiId) {
		this.khuyenMaiId = khuyenMaiId;
	}

	@Column(name = "DonHangID", nullable = false)
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
