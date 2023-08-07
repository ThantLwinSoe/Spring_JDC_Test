package com.jdc.util.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutData {
	
	@Pointcut("within(com..member.dto.*)")
	public void saveBefore() {
		
	}

}
