package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PhieuNhapDTO implements Serializable {
	private Integer phieuNhapId;
	private Date ngayNhap;
	private float tongGiaTri;
	private Date lastUpdate;
	private int nhanVienId;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public PhieuNhapDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getPhieuNhapId() {
		return phieuNhapId;
	}

	public void setPhieuNhapId(Integer phieuNhapId) {
		this.phieuNhapId = phieuNhapId;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public float getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(float tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
}
