package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhieuNhap is a Querydsl query type for PhieuNhap
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPhieuNhap extends EntityPathBase<PhieuNhap> {

    private static final long serialVersionUID = -1164869722L;

    public static final QPhieuNhap phieuNhap = new QPhieuNhap("phieuNhap");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final DatePath<java.util.Date> lastUpdate = createDate("lastUpdate", java.util.Date.class);

    public final DatePath<java.util.Date> ngayNhap = createDate("ngayNhap", java.util.Date.class);

    public final NumberPath<Integer> nhanVienId = createNumber("nhanVienId", Integer.class);

    public final NumberPath<Integer> phieuNhapId = createNumber("phieuNhapId", Integer.class);

    public final NumberPath<Float> tongGiaTri = createNumber("tongGiaTri", Float.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QPhieuNhap(String variable) {
        super(PhieuNhap.class, forVariable(variable));
    }

    public QPhieuNhap(Path<? extends PhieuNhap> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhieuNhap(PathMetadata metadata) {
        super(PhieuNhap.class, metadata);
    }

}

