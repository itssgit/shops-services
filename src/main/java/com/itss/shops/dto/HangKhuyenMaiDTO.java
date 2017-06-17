package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class HangKhuyenMaiDTO implements Serializable {
	private Integer hangKhuyenMaiId;
	private Date lastUpdate;
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

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
}
