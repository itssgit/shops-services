package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChiTietDonHangDTO implements Serializable {
	private Integer chiTietDonHangId;
	private int sanPhamId;
	private int soLuong;
	private int donHangId;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;	

	public ChiTietDonHangDTO() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;
	
	
	public Integer getChiTietDonHangId() {
		return chiTietDonHangId;
	}


	public void setChiTietDonHangId(Integer chiTietDonHangId) {
		this.chiTietDonHangId = chiTietDonHangId;
	}


	public int getSanPhamId() {
		return sanPhamId;
	}


	public void setSanPhamId(int sanPhamId) {
		this.sanPhamId = sanPhamId;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public int getDonHangId() {
		return donHangId;
	}


	public void setDonHangId(int donHangId) {
		this.donHangId = donHangId;
	}


	public Date getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
