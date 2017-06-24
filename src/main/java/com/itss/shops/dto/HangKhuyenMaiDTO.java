package com.itss.shops.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.itss.shops.common.dto.BaseDTO;

@JsonInclude(Include.NON_NULL)
public class HangKhuyenMaiDTO extends BaseDTO {
	private Integer hangKhuyenMaiId;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;
	private int khuyenMaiId;
	private int donHangId;
	
	public HangKhuyenMaiDTO() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;

	public Integer getHangKhuyenMaiId() {
		return hangKhuyenMaiId;
	}

	public void setHangKhuyenMaiId(Integer hangKhuyenMaiId) {
		this.hangKhuyenMaiId = hangKhuyenMaiId;
	}

	public int getKhuyenMaiId() {
		return khuyenMaiId;
	}

	public void setKhuyenMaiId(int khuyenMaiId) {
		this.khuyenMaiId = khuyenMaiId;
	}

	public int getDonHangId() {
		return donHangId;
	}

	public void setDonHangId(int donHangId) {
		this.donHangId = donHangId;
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
