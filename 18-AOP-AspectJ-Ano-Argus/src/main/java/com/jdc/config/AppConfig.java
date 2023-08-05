package com.jdc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.jdc.bean" , "com.jdc.log", "com.jdc.dto"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
	
	

}
