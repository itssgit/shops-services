package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.DonHang;

public interface DonHangRepository extends JpaRepository<DonHang, Integer>, QueryDslPredicateExecutor<DonHang> {

}
