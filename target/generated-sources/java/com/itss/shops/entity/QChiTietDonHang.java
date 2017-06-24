package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChiTietDonHang is a Querydsl query type for ChiTietDonHang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChiTietDonHang extends EntityPathBase<ChiTietDonHang> {

    private static final long serialVersionUID = 1929429329L;

    public static final QChiTietDonHang chiTietDonHang = new QChiTietDonHang("chiTietDonHang");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> chiTietDonHangId = createNumber("chiTietDonHangId", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Integer> donHangId = createNumber("donHangId", Integer.class);

    public final NumberPath<Integer> sanPhamId = createNumber("sanPhamId", Integer.class);

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QChiTietDonHang(String variable) {
        super(ChiTietDonHang.class, forVariable(variable));
    }

    public QChiTietDonHang(Path<? extends ChiTietDonHang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChiTietDonHang(PathMetadata metadata) {
        super(ChiTietDonHang.class, metadata);
    }

}

