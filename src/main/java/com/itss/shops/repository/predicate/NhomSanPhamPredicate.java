package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QNhomSanPham;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class NhomSanPhamPredicate {
	
	public static Predicate findNhomSanPham(String searchText, Boolean isShowInactive) {
        QNhomSanPham nhomSanPham = QNhomSanPham.nhomSanPham;
        BooleanExpression boolExpression;
        boolExpression = nhomSanPham.nhomSanPhamId.gt(0);
        boolExpression = boolExpression.and(nhomSanPham.trangThaiXoa.eq(0).or(nhomSanPham.trangThaiXoa.isNull()));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(nhomSanPham.tenNhom.like("%" + searchText + "%"),
                    		nhomSanPham.moTa.like("%" + searchText + "%"));
        }
        return boolExpression;
    }

}
