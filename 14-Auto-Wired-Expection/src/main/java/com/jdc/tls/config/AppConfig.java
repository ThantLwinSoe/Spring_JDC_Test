package com.jdc.tls.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jdc.tls.beans.CustomService;
import com.jdc.tls.beans.DefaultService;

@Configuration
@ComponentScan(basePackages = "com.jdc.tls.beans")
public class AppConfig {
	
/*	@Bean
	@Qualifier("custom")
	CustomService customService() {
		return new CustomService();
	}
*/	
//	@Bean(autowireCandidate = false) /* AutowireCandidate choose the primary bean*/
/*	@Bean
	@Qualifier("default")
	DefaultService defaultService() {
		return new DefaultService();
	}
*/
}
