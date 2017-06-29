package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QChiTietSanPham;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class ChiTietSanPhamPredicate {
	
	public static Predicate findBySanPhamId(Integer sanphamId   ) {
		QChiTietSanPham chiTietSanPham = QChiTietSanPham.chiTietSanPham;
		BooleanExpression boolExpression;
		boolExpression = chiTietSanPham.sanPhamId.eq(sanphamId);
        boolExpression = boolExpression.and(chiTietSanPham.trangThaiXoa.eq(0));
		return boolExpression;
	}

}
