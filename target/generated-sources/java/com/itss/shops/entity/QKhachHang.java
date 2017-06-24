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

    public final NumberPath<Integer> congno = createNumber("congno", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final StringPath diachi = createString("diachi");

    public final NumberPath<Integer> diemTichluy = createNumber("diemTichluy", Integer.class);

    public final StringPath email = createString("email");

    public final NumberPath<Byte> gioitinh = createNumber("gioitinh", Byte.class);

    public final NumberPath<Integer> khachhangId = createNumber("khachhangId", Integer.class);

    public final StringPath maKhachhang = createString("maKhachhang");

    public final StringPath sdt = createString("sdt");

    public final StringPath tenKhachhang = createString("tenKhachhang");

    public final DateTimePath<java.util.Date> thoigianXoa = createDateTime("thoigianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangthai = createNumber("trangthai", Integer.class);

    public final NumberPath<Integer> trangthaiXoa = createNumber("trangthaiXoa", Integer.class);

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

