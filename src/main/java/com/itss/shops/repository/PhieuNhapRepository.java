package com.itss.shops.repository;

import com.itss.shops.entity.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PhieuNhapRepository extends JpaRepository<PhieuNhap, Integer>, QueryDslPredicateExecutor<PhieuNhap>, PhieuNhapRepositoryCustom {

}
