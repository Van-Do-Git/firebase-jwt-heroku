package com.codegym.jwtfirebaseheroku.service;


import com.codegym.jwtfirebaseheroku.model.AppUser;

public interface IAppUserService extends IGeneralService<AppUser> {
    AppUser getUserByUsername(String username);

    AppUser getCurrentUser();
}
