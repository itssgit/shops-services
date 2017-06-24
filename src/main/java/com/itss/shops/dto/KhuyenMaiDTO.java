package com.itss.shops.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

@JsonInclude(Include.NON_NULL)
public class KhuyenMaiDTO extends BaseDTO {
	private Integer khuyenMaiId;
	private Date thoiGianBatDau;
	private Date thoiGianKetThuc;
	private int loaiKhuyenMai;
	private int doiTuongId;
	private String maKhuyenMai;
	private float giaTriPhanTram;
	private float giaTriCoDinh;
	private String moTa;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	
	public KhuyenMaiDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getKhuyenMaiId() {
		return khuyenMaiId;
	}

	public void setKhuyenMaiId(Integer khuyenMaiId) {
		this.khuyenMaiId = khuyenMaiId;
	}

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public int getLoaiKhuyenMai() {
		return loaiKhuyenMai;
	}

	public void setLoaiKhuyenMai(int loaiKhuyenMai) {
		this.loaiKhuyenMai = loaiKhuyenMai;
	}

	public int getDoiTuongId() {
		return doiTuongId;
	}

	public void setDoiTuongId(int doiTuongId) {
		this.doiTuongId = doiTuongId;
	}

	public String getMaKhuyenMai() {
		return maKhuyenMai;
	}

	public void setMaKhuyenMai(String maKhuyenMai) {
		this.maKhuyenMai = maKhuyenMai;
	}

	public float getGiaTriPhanTram() {
		return giaTriPhanTram;
	}

	public void setGiaTriPhanTram(float giaTriPhanTram) {
		this.giaTriPhanTram = giaTriPhanTram;
	}

	public float getGiaTriCoDinh() {
		return giaTriCoDinh;
	}

	public void setGiaTriCoDinh(float giaTriCoDinh) {
		this.giaTriCoDinh = giaTriCoDinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
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
