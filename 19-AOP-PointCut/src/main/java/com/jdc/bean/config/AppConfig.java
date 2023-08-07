package com.jdc.bean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
		"com.jdc.admin",
		"com.jdc.member",
		"com.jdc.util"
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
	
	

}
