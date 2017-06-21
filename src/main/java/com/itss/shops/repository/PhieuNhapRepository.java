package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.PhieuNhap;

public interface PhieuNhapRepository extends JpaRepository<PhieuNhap, Integer>, QueryDslPredicateExecutor<PhieuNhap> {

}
