package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer>, QueryDslPredicateExecutor<SanPham> {

}
