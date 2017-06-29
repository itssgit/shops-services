package com.itss.shops.repository;

import com.itss.shops.entity.HangKhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface HangKhuyenMaiRepository extends JpaRepository<HangKhuyenMai, Integer>, QueryDslPredicateExecutor<HangKhuyenMai> {

}
