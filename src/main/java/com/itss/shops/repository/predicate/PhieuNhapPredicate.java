package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QPhieuNhap;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class PhieuNhapPredicate {

    public static Predicate PhieuNhap(String searchText, Boolean isShowInactive) {
        QPhieuNhap phieuNhap = QPhieuNhap.phieuNhap;
        BooleanExpression boolExpression;
        boolExpression = phieuNhap.phieuNhapId.gt(0);
        boolExpression = boolExpression.and(phieuNhap.trangThaiXoa.eq(0).or(phieuNhap.trangThaiXoa.isNull()));

        return boolExpression;
    }
}
