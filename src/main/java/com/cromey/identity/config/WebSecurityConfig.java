package com.cromey.identity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // semgrep --config "https://semgrep.live/p/findsecbugs" --output semgrep.json --json
    http // nosem: java.spring.security.audit.spring-csrf-disabled.spring-csrf-disabled
        .csrf().disable();
  }

}
