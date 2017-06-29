package com.itss.shops.repository;

import com.itss.shops.entity.ChiTietSanPham;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, Integer>, QueryDslPredicateExecutor<ChiTietSanPham>, ChiTietSanPhamRepositoryCustom {

    public Page<ChiTietSanPham> findAll(Predicate where, Pageable pageRequest);

}
