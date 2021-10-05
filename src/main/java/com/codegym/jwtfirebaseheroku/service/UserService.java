package com.codegym.jwtfirebaseheroku.service;


import com.codegym.jwtfirebaseheroku.model.AppUser;
import com.codegym.jwtfirebaseheroku.repository.IAppUserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private IAppUserRepository appUserRepository;

    public List<AppUser> findAll() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    public AppUser findById(Long id) {
        return appUserRepository.findById(id).get();
    }

    public boolean add(AppUser user) {
        List<AppUser> listUser = findAll();
        for (AppUser userExist : listUser) {
            if (user.getId() == userExist.getId() || StringUtils.equals(user.getUsername(), userExist.getUsername())) {
                return false;
            }
        }
        appUserRepository.save(user);
        return true;
    }

    public void delete(Long id) {
        appUserRepository.deleteById(id);
    }

    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    public boolean checkLogin(AppUser user) {
        List<AppUser> listUser = findAll();
        for (AppUser userExist : listUser) {
            if (StringUtils.equals(user.getUsername(), userExist.getUsername())
                    && StringUtils.equals(user.getPassword(), userExist.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
