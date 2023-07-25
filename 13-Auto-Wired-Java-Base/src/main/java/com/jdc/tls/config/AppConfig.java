package com.jdc.tls.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jdc.tls.beans")
public class AppConfig {
	
/*	@Bean
	Client doClient() {
		return new Client();
	}
	
	@Bean
	Service doService() {
		return new DefaultService();
	}
*/
}
