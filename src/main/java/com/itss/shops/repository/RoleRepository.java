package com.itss.shops.repository;

import com.itss.shops.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findById(Integer id);

}
