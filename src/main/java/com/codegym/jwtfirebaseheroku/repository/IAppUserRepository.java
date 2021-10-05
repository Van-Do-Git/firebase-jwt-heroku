package com.codegym.jwtfirebaseheroku.repository;


import com.codegym.jwtfirebaseheroku.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
