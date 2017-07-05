package com.itss.shops.repository;

import com.itss.shops.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface DonHangRepository extends JpaRepository<DonHang, Integer>, QueryDslPredicateExecutor<DonHang>, DonHangRepositoryCustom {

}
