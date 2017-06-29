package com.itss.shops.repository;

import com.itss.shops.entity.NhomSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface NhomSanPhamRepository extends JpaRepository<NhomSanPham, Integer>, QueryDslPredicateExecutor<NhomSanPham> {

}
