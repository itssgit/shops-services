package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QChiTietNhapHang;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class ChiTietNhapHangPredicate {

    public static Predicate findByPhieuNhapId(Integer phieuNhapId) {
        QChiTietNhapHang chiTietNhapHang = QChiTietNhapHang.chiTietNhapHang;
        BooleanExpression boolExpression;
        boolExpression = chiTietNhapHang.phieuNhapId.eq(phieuNhapId);
        boolExpression = boolExpression.and(chiTietNhapHang.trangThaiXoa.eq(0));
        return boolExpression;
    }

}
