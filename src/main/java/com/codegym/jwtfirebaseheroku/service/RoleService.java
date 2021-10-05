package com.codegym.jwtfirebaseheroku.service;

import com.codegym.jwtfirebaseheroku.model.AppRole;
import com.codegym.jwtfirebaseheroku.repository.IAppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleService implements IAppRoleService{
    @Autowired
    IAppRoleRepository appRoleRepository;
    @Override
    public Iterable<AppRole> findAll() {
        return null;
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return appRoleRepository.findById(id);
    }

    @Override
    public void save(AppRole appRole) {

    }

    @Override
    public void remove(Long id) {

    }
}
