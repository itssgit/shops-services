package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QKhuyenMai;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class KhuyenMaiPredicate {
	
	public static Predicate findKhuyenMai(String searchText, Boolean isShowInactive) {
        QKhuyenMai khuyenMai = QKhuyenMai.khuyenMai;
        BooleanExpression boolExpression;
        boolExpression = khuyenMai.khuyenMaiId.gt(0);
        boolExpression = boolExpression.and(khuyenMai.trangThaiXoa.eq(0).or(khuyenMai.trangThaiXoa.isNull()));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(khuyenMai.moTa.like("%" + searchText + "%"));
        }
        return boolExpression;
    }

}
