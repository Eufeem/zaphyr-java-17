package com.feem.zaphyr.service;

import java.util.List;

import com.feem.zaphyr.model.Role;

public interface RoleService {

  List<Role> getAll();

  Role insert(Role role);

  Role update(Role role);
  
  void delete(Integer id);

}
