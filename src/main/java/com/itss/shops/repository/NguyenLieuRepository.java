package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.NguyenLieu;

public interface NguyenLieuRepository extends JpaRepository<NguyenLieu, Integer>, QueryDslPredicateExecutor<NguyenLieu>, NguyenLieuRepositoryCustom {

}
