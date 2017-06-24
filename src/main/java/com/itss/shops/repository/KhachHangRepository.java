package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer>, QueryDslPredicateExecutor<KhachHang> {

}