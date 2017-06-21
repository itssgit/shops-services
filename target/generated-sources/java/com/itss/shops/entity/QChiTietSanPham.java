package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChiTietSanPham is a Querydsl query type for ChiTietSanPham
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChiTietSanPham extends EntityPathBase<ChiTietSanPham> {

    private static final long serialVersionUID = 1956519200L;

    public static final QChiTietSanPham chiTietSanPham = new QChiTietSanPham("chiTietSanPham");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> chiTietSanPhamId = createNumber("chiTietSanPhamId", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> nguyenLieuId = createNumber("nguyenLieuId", Integer.class);

    public final NumberPath<Integer> sanPhamId = createNumber("sanPhamId", Integer.class);

    public final NumberPath<Integer> soLuong = createNumber("soLuong", Integer.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QChiTietSanPham(String variable) {
        super(ChiTietSanPham.class, forVariable(variable));
    }

    public QChiTietSanPham(Path<? extends ChiTietSanPham> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChiTietSanPham(PathMetadata metadata) {
        super(ChiTietSanPham.class, metadata);
    }

}

