package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestSpringBean {
	
	@Test
	void testing() {
		try(var context = new GenericXmlApplicationContext()) {
			context.load("classpath:context.xml");
			context.refresh();
			
			var beanOne = context.getBean("beanThree");
			var beanTwo = context.getBean("instanceBean");
			
			assertTrue(beanOne == beanTwo);
		}
	}

}
