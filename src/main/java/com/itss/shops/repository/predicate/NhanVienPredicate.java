package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QNhanVien;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class NhanVienPredicate {
	
	public static Predicate findNhomSanPham(String searchText, Boolean isShowInactive) {
        QNhanVien nhanVien = QNhanVien.nhanVien;
        BooleanExpression boolExpression;
        boolExpression = nhanVien.nhanVienId.gt(0);
        boolExpression = boolExpression.and(nhanVien.trangThaiXoa.eq(0).or(nhanVien.trangThaiXoa.isNull()));

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(nhanVien.hoTen.like("%" + searchText + "%"),
                    		nhanVien.cmnd.like("%" + searchText + "%"));
        }
        return boolExpression;
    }

}
