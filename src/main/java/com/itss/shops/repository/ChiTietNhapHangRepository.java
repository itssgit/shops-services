package com.itss.shops.repository;

import com.itss.shops.entity.ChiTietNhapHang;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface ChiTietNhapHangRepository extends JpaRepository<ChiTietNhapHang, Integer>, QueryDslPredicateExecutor<ChiTietNhapHang>, ChiTietNhapHangRepositoryCustom {

    public Page<ChiTietNhapHang> findAll(Predicate where, Pageable pageRequest);

}