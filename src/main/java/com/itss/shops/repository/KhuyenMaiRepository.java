package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.KhuyenMai;

public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer>, QueryDslPredicateExecutor<KhuyenMai> {

}
