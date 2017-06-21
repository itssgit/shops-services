package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHangKhuyenMai is a Querydsl query type for HangKhuyenMai
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHangKhuyenMai extends EntityPathBase<HangKhuyenMai> {

    private static final long serialVersionUID = 1238743093L;

    public static final QHangKhuyenMai hangKhuyenMai = new QHangKhuyenMai("hangKhuyenMai");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Integer> donHangId = createNumber("donHangId", Integer.class);

    public final NumberPath<Integer> hangKhuyenMaiId = createNumber("hangKhuyenMaiId", Integer.class);

    public final NumberPath<Integer> khuyenMaiId = createNumber("khuyenMaiId", Integer.class);

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QHangKhuyenMai(String variable) {
        super(HangKhuyenMai.class, forVariable(variable));
    }

    public QHangKhuyenMai(Path<? extends HangKhuyenMai> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHangKhuyenMai(PathMetadata metadata) {
        super(HangKhuyenMai.class, metadata);
    }

}

