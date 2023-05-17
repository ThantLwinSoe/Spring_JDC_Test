package com.jdc.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jdc.bean"})
public class MyConfig {
	
	@Bean
	public Date getCurrentDate() {
		return new Date();
	}
}
