package com.cromey.identity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // ruleid: spring-csrf-disabled
        // "https://semgrep.live/p/dmspils.the-full-monty"
        http
            .csrf()
            .disable();
    }
    
}
