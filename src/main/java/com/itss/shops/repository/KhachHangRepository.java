package com.itss.shops.repository;

import com.itss.shops.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer>, QueryDslPredicateExecutor<KhachHang> {

}
