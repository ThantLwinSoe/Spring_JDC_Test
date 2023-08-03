package com.jdc.tls.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopLogging {
	
	@Pointcut("bean(hello)") // bean name can be changed by value of @Components
	public void servicePointCut() {
		
	}
	
	@Before(value = "servicePointCut()") // can write only "servicePointCut()"
	public void logging() {
		System.out.println("Hello Logging Method.");
	}
}
