package com.yhh.resume;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println("호스트 접근 허용");
		// 로컬 리액트 호스트에서 접근 가능하게 설정
		registry.addMapping("/**").allowedOrigins("*");
	}
}
