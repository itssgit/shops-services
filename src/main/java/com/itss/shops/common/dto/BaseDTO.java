package com.itss.shops.common.dto;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseDTO implements Serializable {

	
	private Date createdTime;
	private Date updatedTime;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4154596743163219674L;

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
}
