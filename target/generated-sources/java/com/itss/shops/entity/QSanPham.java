package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSanPham is a Querydsl query type for SanPham
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSanPham extends EntityPathBase<SanPham> {

    private static final long serialVersionUID = -1821153824L;

    public static final QSanPham sanPham = new QSanPham("sanPham");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Float> donGia = createNumber("donGia", Float.class);

    public final BooleanPath hienThi = createBoolean("hienThi");

    public final StringPath hinhAnh = createString("hinhAnh");

    public final DateTimePath<java.util.Date> lastUpdate = createDateTime("lastUpdate", java.util.Date.class);

    public final NumberPath<Integer> moTa = createNumber("moTa", Integer.class);

    public final NumberPath<Integer> nhomSanPhamId = createNumber("nhomSanPhamId", Integer.class);

    public final NumberPath<Integer> sanPhamId = createNumber("sanPhamId", Integer.class);

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QSanPham(String variable) {
        super(SanPham.class, forVariable(variable));
    }

    public QSanPham(Path<? extends SanPham> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSanPham(PathMetadata metadata) {
        super(SanPham.class, metadata);
    }

}

