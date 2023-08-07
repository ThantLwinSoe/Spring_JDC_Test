package com.jdc.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutData {
	
	@Pointcut(value = "execution(* search*(..))")
	public void memberDto() {
		
	}
}
