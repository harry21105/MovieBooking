package com.example;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    	.authorizeRequests()
    	.antMatchers("/css/**", "/index").permitAll()  
    	.antMatchers("/shoppingCartList/**").hasRole("USER")
    	.and()
    	.formLogin()
    	.loginPage("/login").failureUrl("/login-error");
    	//http
    	//.csrf().disable();
    }

    @Autowired
    private DataSource dataSource;
 
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	auth
    	.jdbcAuthentication()
    	.dataSource(dataSource);
    }

}