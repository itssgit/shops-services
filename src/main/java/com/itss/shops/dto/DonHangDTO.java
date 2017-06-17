package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DonHangDTO implements Serializable {
	private Integer donHangId;
	private Date thoiGian;
	private float tongTien;
	private String ghiChu;
	private Date lastUpdate;
	private int banId;
	private int nhanVienId;
	
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

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
	
}
