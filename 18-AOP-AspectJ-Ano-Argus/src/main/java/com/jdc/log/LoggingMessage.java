package com.jdc.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.jdc.dto.Result;

@Component
@Aspect
public class LoggingMessage {
	
	@Before(value = "bean(one) && args(person,..)" , argNames = "person")
	public void beforeMethod(String person) { // argNames and beforeMethod parameters must be same
		System.out.println("Before Method!!!");
		System.out.println("Person name is %s".formatted(person));
	} 
	
	@AfterThrowing(value = "bean(one) && args(numberOne,numberTwo)" 
			, throwing = "exception"
			, argNames = "exception, numberOne,numberTwo")
	public void afterThrowing(Exception exception, int numberOne , int numberTwo) {
		System.out.println(exception.getClass().getSimpleName());
		System.out.println(exception.getMessage());
		
		System.out.println("Number One is %d".formatted(numberOne));
		System.out.println("Number Two is %d".formatted(numberTwo));
	}
	
	@AfterReturning(value = "bean(one) && execution(com.jdc..Result *(..)) && args(person,number)",
			returning = "result" , argNames = "result,person,number")
	public void afterReturning(Result result, String person, int number) {
		System.out.println("After Returning!!!");
		
		System.out.println("person name is %s".formatted(person));
		System.out.println("Number is %d".formatted(number));
		System.out.println(result);
	}
	
	
	@Around(value = "bean(one) && args(person,count)" , argNames = "person,count")
	public Object aroundInvoke(ProceedingJoinPoint joinPoint,String person,int count) {
		
		Object result;
		System.out.println("Before Invoke");
		System.out.println("%s".formatted(person));
		System.out.println("%d".formatted(count));
		try {
			result = joinPoint.proceed();
			System.out.println("After Invoke");
		} catch (Throwable e) {
			System.out.println("Exception");
			throw new RuntimeException();
		}finally {
			System.out.println("Finally Method!!!");
			
		}
		
		return result;
	}
	
	@After(value = "bean(one) && args(..,count)", argNames = "count")
	public void afterMethod(int count) {
		System.out.println("After Method!!!");
		System.out.println("Count is %d".formatted(count));
	}

}
