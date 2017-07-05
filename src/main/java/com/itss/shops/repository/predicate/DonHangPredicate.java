package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QDonHang;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class DonHangPredicate {

    public static Predicate findDonHang(String searchText, Boolean isShowInactive) {
        QDonHang donHang = QDonHang.donHang;
        BooleanExpression boolExpression;
        boolExpression = donHang.donHangId.gt(0);
        boolExpression = boolExpression.and(donHang.trangThaiXoa.eq(0).or(donHang.trangThaiXoa.isNull()));

        return boolExpression;
    }
}
