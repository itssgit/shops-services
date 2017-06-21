package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDonHang is a Querydsl query type for DonHang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDonHang extends EntityPathBase<DonHang> {

    private static final long serialVersionUID = -1848243695L;

    public static final QDonHang donHang = new QDonHang("donHang");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> banId = createNumber("banId", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Integer> donHangId = createNumber("donHangId", Integer.class);

    public final StringPath ghiChu = createString("ghiChu");

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> nhanVienId = createNumber("nhanVienId", Integer.class);

    public final DateTimePath<java.util.Date> thoiGian = createDateTime("thoiGian", java.util.Date.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Float> tongTien = createNumber("tongTien", Float.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QDonHang(String variable) {
        super(DonHang.class, forVariable(variable));
    }

    public QDonHang(Path<? extends DonHang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDonHang(PathMetadata metadata) {
        super(DonHang.class, metadata);
    }

}

