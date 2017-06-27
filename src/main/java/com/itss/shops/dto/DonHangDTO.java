package com.itss.shops.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

@JsonInclude(Include.NON_NULL)
public class DonHangDTO extends BaseDTO {
	private Integer donHangId;
	private Date thoiGian;
	private float tongTien;
	private String ghiChu;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	private int banId;
	private int nhanVienId;

	private List<KhuyenMaiDTO> khuyenMaiDTOList;
	
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

	public List<KhuyenMaiDTO> getKhuyenMaiDTOList() {
		return khuyenMaiDTOList;
	}

	public void setKhuyenMaiDTOList(List<KhuyenMaiDTO> khuyenMaiDTOList) {
		this.khuyenMaiDTOList = khuyenMaiDTOList;
	}
}
