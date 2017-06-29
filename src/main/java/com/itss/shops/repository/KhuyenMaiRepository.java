package com.itss.shops.repository;

import com.itss.shops.entity.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer>, QueryDslPredicateExecutor<KhuyenMai> {

}
