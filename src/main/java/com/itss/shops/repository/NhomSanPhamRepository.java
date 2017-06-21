package com.itss.shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.itss.shops.entity.NhomSanPham;

public interface NhomSanPhamRepository extends JpaRepository<NhomSanPham, Integer>, QueryDslPredicateExecutor<NhomSanPham> {

}
