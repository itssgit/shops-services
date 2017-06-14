package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QKhuyenMai is a Querydsl query type for KhuyenMai
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKhuyenMai extends EntityPathBase<KhuyenMai> {

    private static final long serialVersionUID = 1901311623L;

    public static final QKhuyenMai khuyenMai = new QKhuyenMai("khuyenMai");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Integer> doiTuongId = createNumber("doiTuongId", Integer.class);

    public final NumberPath<Float> giaTriCoDinh = createNumber("giaTriCoDinh", Float.class);

    public final NumberPath<Float> giaTriPhanTram = createNumber("giaTriPhanTram", Float.class);

    public final NumberPath<Integer> khuyenMaiId = createNumber("khuyenMaiId", Integer.class);

    public final DatePath<java.util.Date> lastUpdate = createDate("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> loaiKhuyenMai = createNumber("loaiKhuyenMai", Integer.class);

    public final StringPath maKhuyenMai = createString("maKhuyenMai");

    public final StringPath moTa = createString("moTa");

    public final DatePath<java.util.Date> thoiGianBatDau = createDate("thoiGianBatDau", java.util.Date.class);

    public final DatePath<java.util.Date> thoiGianKetThuc = createDate("thoiGianKetThuc", java.util.Date.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QKhuyenMai(String variable) {
        super(KhuyenMai.class, forVariable(variable));
    }

    public QKhuyenMai(Path<? extends KhuyenMai> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKhuyenMai(PathMetadata metadata) {
        super(KhuyenMai.class, metadata);
    }

}

