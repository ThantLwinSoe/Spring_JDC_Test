package com.jdc.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.bean.ShapeDemo;

public class TestJBOnly {
	
	@Test
	void testOne() {
		
		try(var context = new AnnotationConfigApplicationContext()) {
			context.scan("com.jdc.config");
			context.refresh();
			
			var bean = context.getBean(ShapeDemo.class);
			bean.getShape("Circle");
			
			var beanDate = context.getBean(Date.class);
			System.out.println(beanDate.getHours());
		}
	}

}
