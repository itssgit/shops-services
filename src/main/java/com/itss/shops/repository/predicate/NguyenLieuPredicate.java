package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QNguyenLieu;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class NguyenLieuPredicate {

    public static Predicate findNguyenLieu(String searchText, Boolean isShowInactive) {
        QNguyenLieu nguyenLieu = QNguyenLieu.nguyenLieu;
        BooleanExpression boolExpression;
        boolExpression = nguyenLieu.nguyenLieuId.gt(0);
        boolExpression = boolExpression.and(nguyenLieu.trangThaiXoa.eq(0));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(nguyenLieu.ten.like("%" + searchText + "%"));
        }
        return boolExpression;
    }
}
