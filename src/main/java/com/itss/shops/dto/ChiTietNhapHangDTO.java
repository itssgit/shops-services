package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChiTietNhapHangDTO implements Serializable {
	private Integer chiTietNhapHangId;
	private int nguyenLieuId;
	private int soLuong;
	private float donGia;
	private int phieuNhapId;
	private Date lastUpdate;
	

	public ChiTietNhapHangDTO() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;


	public Integer getChiTietNhapHangId() {
		return chiTietNhapHangId;
	}
	public void setChiTietNhapHangId(Integer chiTietNhapHangId) {
		this.chiTietNhapHangId = chiTietNhapHangId;
	}
	public int getNguyenLieuId() {
		return nguyenLieuId;
	}
	public void setNguyenLieuId(int nguyenLieuId) {
		this.nguyenLieuId = nguyenLieuId;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public int getPhieuNhapId() {
		return phieuNhapId;
	}
	public void setPhieuNhapId(int phieuNhapId) {
		this.phieuNhapId = phieuNhapId;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
