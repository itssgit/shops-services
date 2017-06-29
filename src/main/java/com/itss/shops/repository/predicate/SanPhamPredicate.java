package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QSanPham;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class SanPhamPredicate {

    public static Predicate findSanPham(String searchText, Boolean isShowInactive) {
        QSanPham sanPham = QSanPham.sanPham;
        BooleanExpression boolExpression;
        boolExpression = sanPham.sanPhamId.gt(0);
        boolExpression = boolExpression.and(sanPham.trangThaiXoa.eq(0));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(sanPham.tenSanPham.like("%" + searchText + "%"),
                            sanPham.moTa.like("%" + searchText + "%"));
        }
        return boolExpression;
    }
}
