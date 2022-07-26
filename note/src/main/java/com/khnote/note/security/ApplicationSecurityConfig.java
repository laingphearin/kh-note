package com.khnote.note.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(a -> a
                        .antMatchers("/swagger-ui/index.html", "/swagger-ui/*", "/v3/api-docs", "/v3/api-docs/*").permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2Login();
    }
}
