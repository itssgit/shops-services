package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChiTietNhapHang is a Querydsl query type for ChiTietNhapHang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChiTietNhapHang extends EntityPathBase<ChiTietNhapHang> {

    private static final long serialVersionUID = 1972414975L;

    public static final QChiTietNhapHang chiTietNhapHang = new QChiTietNhapHang("chiTietNhapHang");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> chiTietNhapHangId = createNumber("chiTietNhapHangId", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Float> donGia = createNumber("donGia", Float.class);

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> nguyenLieuId = createNumber("nguyenLieuId", Integer.class);

    public final NumberPath<Integer> phieuNhapId = createNumber("phieuNhapId", Integer.class);

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QChiTietNhapHang(String variable) {
        super(ChiTietNhapHang.class, forVariable(variable));
    }

    public QChiTietNhapHang(Path<? extends ChiTietNhapHang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChiTietNhapHang(PathMetadata metadata) {
        super(ChiTietNhapHang.class, metadata);
    }

}

