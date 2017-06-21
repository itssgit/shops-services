package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NhanVienDTO implements Serializable {
	private Integer nhanVienId;
	private String hoTen;
	private Date ngaySinh;
	private String cmnd;
	private String sdt;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public NhanVienDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getNhanVienId() {
		return nhanVienId;
	}

	public void setNhanVienId(Integer nhanVienId) {
		this.nhanVienId = nhanVienId;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
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
