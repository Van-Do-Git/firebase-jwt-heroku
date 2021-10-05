package com.codegym.jwtfirebaseheroku.fomater;

import com.codegym.jwtfirebaseheroku.model.AppRole;
import com.codegym.jwtfirebaseheroku.service.IAppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;


import java.text.ParseException;
import java.util.Locale;
@Component
public class FomaterRole implements Formatter<AppRole> {
    @Autowired
    IAppRoleService roleService;

    @Override
    public AppRole parse(String text, Locale locale) throws ParseException {
        return roleService.findById(Long.parseLong(text)).get();
    }

    @Override
    public String print(AppRole object, Locale locale) {
        return null;
    }
}
