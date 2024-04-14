package com.feem.zaphyr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.feem.zaphyr.dao.RoleDao;
import com.feem.zaphyr.model.Role;
import com.feem.zaphyr.service.RoleService;

public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleDao roleDao;

  @Override
  public List<Role> getAll() {
    return roleDao.findAll();
  }

  @Override
  public Role insert(Role role) {
    return roleDao.save(role);
  }

  @Override
  public Role update(Role role) {
    return roleDao.save(role);
  }

  @Override
  public void delete(Integer id) {
    roleDao.deleteById(id);
  }

}
