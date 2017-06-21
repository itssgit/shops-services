package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChiTietSanPhamDTO implements Serializable {
	private Integer chiTietSanPhamId;
	private int sanPhamId;
	private int nguyenLieuId;
	private int soLuong;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public ChiTietSanPhamDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getChiTietSanPhamId() {
		return chiTietSanPhamId;
	}
	public void setChiTietSanPhamId(Integer chiTietSanPhamId) {
		this.chiTietSanPhamId = chiTietSanPhamId;
	}
	public int getSanPhamId() {
		return sanPhamId;
	}
	public void setSanPhamId(int sanPhamId) {
		this.sanPhamId = sanPhamId;
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
