package com.itss.shops.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import com.itss.shops.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer>, QueryDslPredicateExecutor<SanPham>, SanPhamRepositoryCustom{

	@Query("select u from SanPham u where u.sanPhamId=:sanphamID")
	public Optional<SanPham> findById(@Param("sanphamID") Integer sanphamID);
}
