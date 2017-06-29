package com.itss.shops.repository;

import com.itss.shops.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer>, QueryDslPredicateExecutor<NhanVien> {

}
