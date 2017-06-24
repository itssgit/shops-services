package com.itss.shops.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBan is a Querydsl query type for Ban
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBan extends EntityPathBase<Ban> {

    private static final long serialVersionUID = 1908433867L;

    public static final QBan ban = new QBan("ban");

    public final com.itss.shops.common.entity.QBaseEntity _super = new com.itss.shops.common.entity.QBaseEntity(this);

    public final NumberPath<Integer> banId = createNumber("banId", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdTime = _super.createdTime;

    public final NumberPath<Integer> ghepBanBanId = createNumber("ghepBanBanId", Integer.class);

    public final StringPath maSo = createString("maSo");

    public final DateTimePath<java.util.Date> thoiGianXoa = createDateTime("thoiGianXoa", java.util.Date.class);

    public final NumberPath<Integer> trangThai = createNumber("trangThai", Integer.class);

    public final NumberPath<Integer> trangThaiXoa = createNumber("trangThaiXoa", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> updatedTime = _super.updatedTime;

    public QBan(String variable) {
        super(Ban.class, forVariable(variable));
    }

    public QBan(Path<? extends Ban> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBan(PathMetadata metadata) {
        super(Ban.class, metadata);
    }

}

