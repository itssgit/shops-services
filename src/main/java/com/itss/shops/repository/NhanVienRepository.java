package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer>, QueryDslPredicateExecutor<NhanVien> {

}
