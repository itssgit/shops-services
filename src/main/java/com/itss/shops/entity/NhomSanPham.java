package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.itss.shops.common.entity.BaseEntity;
/**
 * NhomSanPham generated by hbm2java
 */
@Entity
@Table(name = "NhomSanPham", catalog = "Coffee")
public class NhomSanPham extends BaseEntity {

	private Integer nhomSanPhamId;
	private String hinhAnh;
	private String tenNhom;
	private String moTa;
	private boolean hienThi;
	private Date lastUpdate;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;

	public NhomSanPham() {
	}

	public NhomSanPham(String tenNhom, String moTa, boolean hienThi, Date lastUpdate) {
		this.tenNhom = tenNhom;
		this.moTa = moTa;
		this.hienThi = hienThi;
		this.lastUpdate = lastUpdate;
	}

	public NhomSanPham(String hinhAnh, String tenNhom, String moTa, boolean hienThi, Date lastUpdate,
			Integer trangThaiXoa, Date thoiGianXoa) {
		this.hinhAnh = hinhAnh;
		this.tenNhom = tenNhom;
		this.moTa = moTa;
		this.hienThi = hienThi;
		this.lastUpdate = lastUpdate;
		this.trangThaiXoa = trangThaiXoa;
		this.thoiGianXoa = thoiGianXoa;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "NhomSanPhamID", unique = true, nullable = false)
	public Integer getNhomSanPhamId() {
		return this.nhomSanPhamId;
	}

	public void setNhomSanPhamId(Integer nhomSanPhamId) {
		this.nhomSanPhamId = nhomSanPhamId;
	}

	@Column(name = "HinhAnh")
	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@Column(name = "TenNhom", nullable = false)
	public String getTenNhom() {
		return this.tenNhom;
	}

	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}

	@Column(name = "MoTa", nullable = false)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "HienThi", nullable = false)
	public boolean isHienThi() {
		return this.hienThi;
	}

	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastUpdate", nullable = false, length = 19)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "TrangThaiXoa")
	public Integer getTrangThaiXoa() {
		return this.trangThaiXoa;
	}

	public void setTrangThaiXoa(Integer trangThaiXoa) {
		this.trangThaiXoa = trangThaiXoa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ThoiGianXoa", length = 19)
	public Date getThoiGianXoa() {
		return this.thoiGianXoa;
	}

	public void setThoiGianXoa(Date thoiGianXoa) {
		this.thoiGianXoa = thoiGianXoa;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7572465635351838981L;
}
