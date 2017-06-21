package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QKhachHang is a Querydsl query type for KhachHang
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKhachHang extends EntityPathBase<KhachHang> {

    private static final long serialVersionUID = 702923991L;

    public static final QKhachHang khachHang = new QKhachHang("khachHang");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> congNo = createNumber("congNo", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final StringPath diaChi = createString("diaChi");

    public final NumberPath<Integer> diemTichLuy = createNumber("diemTichLuy", Integer.class);

    public final StringPath email = createString("email");

    public final NumberPath<Byte> gioiTinh = createNumber("gioiTinh", Byte.class);

    public final StringPath maKh = createString("maKh");

    public final StringPath sdt = createString("sdt");

    public final StringPath status = createString("status");

    public final StringPath tenKh = createString("tenKh");

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QKhachHang(String variable) {
        super(KhachHang.class, forVariable(variable));
    }

    public QKhachHang(Path<? extends KhachHang> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKhachHang(PathMetadata metadata) {
        super(KhachHang.class, metadata);
    }

}

