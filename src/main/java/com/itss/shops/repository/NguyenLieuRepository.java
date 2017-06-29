package com.itss.shops.repository;

import com.itss.shops.entity.NguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface NguyenLieuRepository extends JpaRepository<NguyenLieu, Integer>, QueryDslPredicateExecutor<NguyenLieu>, NguyenLieuRepositoryCustom {

}
