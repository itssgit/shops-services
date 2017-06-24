package com.itss.shops.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

@JsonInclude(Include.NON_NULL)
public class NhomSanPhamDTO extends BaseDTO {
	private Integer nhomSanPhamId;
	private String hinhAnh;
	private String tenNhom;
	private String moTa;
	private boolean hienThi;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public NhomSanPhamDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getNhomSanPhamId() {
		return nhomSanPhamId;
	}

	public void setNhomSanPhamId(Integer nhomSanPhamId) {
		this.nhomSanPhamId = nhomSanPhamId;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getTenNhom() {
		return tenNhom;
	}

	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public boolean isHienThi() {
		return hienThi;
	}

	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
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
