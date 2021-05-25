/*
package com.yhh.resume;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("시큐리티 설정 체크");
		// antMathers() 에 있는 패턴만 모든 권한을 허용(permitALl) 한다는 의미
		// 일단 모두 허용 /**
		http.authorizeRequests(a -> 
			a.antMatchers(
					"/**").permitAll());
		super.configure(http);
	}
}*/