package com.itss.shops.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BanDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 16207331533605865L;
	
	
	private Integer banId;
	private String maSo;
	private int trangThai;
	private Date lastUpdate;	
	private Integer ghepBanBanId;
	

	public BanDTO() {
		super();
	}
	
	public Integer getBanId() {
		return banId;
	}
	public void setBanId(Integer banId) {
		this.banId = banId;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Integer getGhepBanBanId() {
		return ghepBanBanId;
	}
	public void setGhepBanBanId(Integer ghepBanBanId) {
		this.ghepBanBanId = ghepBanBanId;
	}

}
