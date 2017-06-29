package com.itss.shops.repository;

import com.itss.shops.entity.ChiTietDonHang;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Integer>, QueryDslPredicateExecutor<ChiTietDonHang> {

    public Page<ChiTietDonHang> findAll(Predicate where, Pageable pageRequest);

}
