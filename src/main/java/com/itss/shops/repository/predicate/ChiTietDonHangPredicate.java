package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QChiTietDonHang;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

/**
 * Created by hungdd-cadpro on 21/07/2017.
 */
public class ChiTietDonHangPredicate {
    public static Predicate findByDonHangId(Integer donHangId) {
        QChiTietDonHang chiTietDonHang = QChiTietDonHang.chiTietDonHang;
        BooleanExpression boolExpression;
        boolExpression = chiTietDonHang.donHangId.eq(donHangId);
        boolExpression = boolExpression.and(chiTietDonHang.trangThaiXoa.eq(0).
                or(chiTietDonHang.trangThaiXoa.isNull()));
        return boolExpression;
    }
}
