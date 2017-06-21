package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNguyenLieu is a Querydsl query type for NguyenLieu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNguyenLieu extends EntityPathBase<NguyenLieu> {

    private static final long serialVersionUID = 29010007L;

    public static final QNguyenLieu nguyenLieu = new QNguyenLieu("nguyenLieu");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final StringPath donVi = createString("donVi");

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> nguyenLieuId = createNumber("nguyenLieuId", Integer.class);

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public final StringPath ten = createString("ten");

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QNguyenLieu(String variable) {
        super(NguyenLieu.class, forVariable(variable));
    }

    public QNguyenLieu(Path<? extends NguyenLieu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNguyenLieu(PathMetadata metadata) {
        super(NguyenLieu.class, metadata);
    }

}

