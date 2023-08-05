package com.jdc.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingData {
	
	@Before("bean(hello)")
	public void beforeMethod() {
		System.out.println("Before Method!!!");
	}
	
	@AfterReturning(value = "bean(hello)")
	public void afterReturning() {
		System.out.println("After Return Method!!!");
	}
	
	@AfterThrowing("bean(hello)")
	public void afterThrowing() {
		System.out.println("After Throwing");
	}
	
	@After("bean(hello)")
	public void after() {
		System.out.println("After Method");
		
	}
	
	@Around(value = "bean(hello)")
	Object aroundInvoke(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Object result;
		System.out.println("Before Invoke");
		
		try {
			result = joinPoint.proceed();
			
			System.out.println("Join Point After");
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}finally {
			System.out.println("Finally Result");
		}
	
		
		return result;
	}
}
