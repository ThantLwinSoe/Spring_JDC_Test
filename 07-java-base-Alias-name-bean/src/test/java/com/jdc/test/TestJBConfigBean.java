package com.jdc.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.pojo.WeatherDemo;

public class TestJBConfigBean {
	
	@Test
	void testOne() {
		try(var context = new AnnotationConfigApplicationContext()) {
			context.scan("com.jdc.config");
			context.refresh();
			
			var bean = context.getBean(WeatherDemo.class);
			bean.checkCloud("Sunny");
			var date = context.getBean(Date.class);
			System.out.println(date);
		}
	}

}
