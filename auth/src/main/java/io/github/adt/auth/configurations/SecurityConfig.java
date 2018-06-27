package io.github.adt.auth.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Autowired
  private AuthenticationManager authenticationManager;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.requestMatchers()
        .antMatchers("/login", "/oauth/authorize").and().authorizeRequests()
        .anyRequest().authenticated().and().formLogin().permitAll();
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.parentAuthenticationManager(authenticationManager)
        .inMemoryAuthentication()
        .withUser("admin").password("admin").roles("ADMIN").and()
        .withUser("exmgr").password("exmgr").roles("USER");
  }
}