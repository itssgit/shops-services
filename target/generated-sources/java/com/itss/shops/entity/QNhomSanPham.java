package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNhomSanPham is a Querydsl query type for NhomSanPham
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNhomSanPham extends EntityPathBase<NhomSanPham> {

    private static final long serialVersionUID = 87015336L;

    public static final QNhomSanPham nhomSanPham = new QNhomSanPham("nhomSanPham");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final BooleanPath hienThi = createBoolean("hienThi");

    public final StringPath hinhAnh = createString("hinhAnh");

    public final DatePath<java.util.Date> lastUpdate = createDate("lastUpdate", java.util.Date.class);

    public final StringPath moTa = createString("moTa");

    public final NumberPath<Integer> nhomSanPhamId = createNumber("nhomSanPhamId", Integer.class);

    public final StringPath tenNhom = createString("tenNhom");

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QNhomSanPham(String variable) {
        super(NhomSanPham.class, forVariable(variable));
    }

    public QNhomSanPham(Path<? extends NhomSanPham> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNhomSanPham(PathMetadata metadata) {
        super(NhomSanPham.class, metadata);
    }

}

