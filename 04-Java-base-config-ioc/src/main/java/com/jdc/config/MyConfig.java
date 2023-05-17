package com.jdc.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.bean.ShapeDemo;

@Configuration
public class MyConfig {
	
	@Bean
	public ShapeDemo getShapeDemo() {
		return new ShapeDemo();
	}
	
	@Bean
	public Date getDate() {
		return new Date();
	}
}
