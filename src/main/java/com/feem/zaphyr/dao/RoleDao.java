package com.feem.zaphyr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feem.zaphyr.model.Role;

public interface RoleDao extends JpaRepository<Role, Integer> {

}
