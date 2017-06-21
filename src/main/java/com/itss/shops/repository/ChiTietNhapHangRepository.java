package com.itss.shops.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.ChiTietNhapHang;
import com.querydsl.core.types.Predicate;

public interface ChiTietNhapHangRepository extends JpaRepository<ChiTietNhapHang, Integer>, QueryDslPredicateExecutor<ChiTietNhapHang> {

	public Page<ChiTietNhapHang> findAll(Predicate where, Pageable pageRequest);
	
}
