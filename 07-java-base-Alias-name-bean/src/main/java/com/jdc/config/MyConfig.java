package com.jdc.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jdc.pojo"})
public class MyConfig {
	
	@Bean(name = {"currentDate","otherDate"})
	public Date currentDate() {
		return new Date();
	}
}
