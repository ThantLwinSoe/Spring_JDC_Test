package com.jdc.util.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
	
//	@Before(value = "bean(hello)")
	
	
	
	
//	@Before(value = "saveBefore()")
	@After("PointCutData.saveBefore()")
	public void searchBefore(JoinPoint joinPoint) {
		System.out.println("Aspect Methods");
		System.out.println("--------------------");
		System.out.println("%-19s : %s%n".formatted("Target Class",joinPoint.getTarget().getClass().getSimpleName()));
		System.out.println("%-19s : %s%n".formatted("Target Method",joinPoint.getSignature().getName()));
		System.out.println("--------------------");
		
	}
}
