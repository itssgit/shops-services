package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNhanVien is a Querydsl query type for NhanVien
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNhanVien extends EntityPathBase<NhanVien> {

    private static final long serialVersionUID = 827245671L;

    public static final QNhanVien nhanVien = new QNhanVien("nhanVien");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final StringPath cmnd = createString("cmnd");

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final StringPath hoTen = createString("hoTen");

    public final DateTimePath<java.util.Date> ngaySinh = createDateTime("ngaySinh", java.util.Date.class);

    public final NumberPath<Integer> nhanVienId = createNumber("nhanVienId", Integer.class);

    public final StringPath sdt = createString("sdt");

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QNhanVien(String variable) {
        super(NhanVien.class, forVariable(variable));
    }

    public QNhanVien(Path<? extends NhanVien> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNhanVien(PathMetadata metadata) {
        super(NhanVien.class, metadata);
    }

}

