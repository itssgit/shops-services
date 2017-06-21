package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SanPhamDTO implements Serializable {
	private Integer sanPhamId;
	private Integer nhomSanPhamId;
	private float donGia;
	private int moTa;
	private String hinhAnh;
	private boolean hienThi;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public SanPhamDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getSanPhamId() {
		return sanPhamId;
	}

	public void setSanPhamId(Integer sanPhamId) {
		this.sanPhamId = sanPhamId;
	}

	public Integer getNhomSanPhamId() {
		return nhomSanPhamId;
	}

	public void setNhomSanPhamId(Integer nhomSanPhamId) {
		this.nhomSanPhamId = nhomSanPhamId;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getMoTa() {
		return moTa;
	}

	public void setMoTa(int moTa) {
		this.moTa = moTa;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public boolean isHienThi() {
		return hienThi;
	}

	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
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
