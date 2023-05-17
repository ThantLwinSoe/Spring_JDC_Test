package com.jdc.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.bean.ShapeDemo;
import com.jdc.config.MyConfig;

public class TestAnnoAndJB {
	
	@Test
	public void testMultiRefresh() {
		try(var context = new ClassPathXmlApplicationContext("classpath:context.xml")) {
			context.refresh();
			var bean = context.getBean(ShapeDemo.class);
			bean.getShape("Rectangle");
			var beanDate = context.getBean(Date.class);
			System.out.println(beanDate);
		}
	}
	
	
	
//	@Test
	public void testOne() {
		try(var context = new AnnotationConfigApplicationContext(MyConfig.class)) {
			var bean = context.getBean(ShapeDemo.class);
			bean.getShape("Triangle");
			
			var beanDate = context.getBean(Date.class);
			System.out.println(beanDate);
		}
	}

}
