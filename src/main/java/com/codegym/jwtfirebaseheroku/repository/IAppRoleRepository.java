package com.codegym.jwtfirebaseheroku.repository;

import com.codegym.jwtfirebaseheroku.model.AppRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepository extends CrudRepository<AppRole, Long> {
}
