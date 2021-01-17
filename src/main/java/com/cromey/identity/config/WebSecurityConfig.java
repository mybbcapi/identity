package com.cromey.identity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // ruleid: spring-csrf-disabled
        // r/java.spring.security.audit.spring-csrf-disabled.spring-csrf-disabled
        http
            .csrf()
            .disable();
    }
    
}
