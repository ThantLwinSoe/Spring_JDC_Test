package com.jdc.test.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.ioc.HelloSpringIoC;

public class TestSpringIoc {
		
		@Test
		public void isAllright() {
			
			try(var context = new AnnotationConfigApplicationContext()){
				context.scan("com.jdc.ioc");
				context.refresh();
				
				var bean = context.getBean(HelloSpringIoC.class);
				bean.start();
				bean.shutDown();
			}
			
		}

}
