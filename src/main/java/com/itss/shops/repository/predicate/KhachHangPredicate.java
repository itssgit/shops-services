package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QKhachHang;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class KhachHangPredicate {
	
	public static Predicate findKhachHang(String searchText, Boolean isShowInactive) {
        QKhachHang khachHang = QKhachHang.khachHang;
        BooleanExpression boolExpression;
        boolExpression = khachHang.khachhangId.gt(0);
        boolExpression = boolExpression.and(khachHang.trangthaiXoa.eq(0).or(khachHang.trangthaiXoa.isNull()));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(khachHang.tenKhachhang.like("%" + searchText + "%"),
                    		khachHang.email.like("%" + searchText + "%"));
        }
        return boolExpression;
    }

}
