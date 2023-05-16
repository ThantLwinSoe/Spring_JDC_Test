package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jdc.tls.AnnoDemo;

public class CheckAnnoConfig {
	@Test
	public void doFileXmlConf() {
		
		try(var context = new FileSystemXmlApplicationContext("file:context.xml")) {
			var bean = context.getBean(AnnoDemo.class);
			bean.setColor("Black");
		}
	}
	
//	@Test
	public void doMultipleRefresh() {
		
		try(var context = new ClassPathXmlApplicationContext("classpath:context.xml")) {
			var bean = context.getBean(AnnoDemo.class);
			bean.setColor("Red");
		}
		
		
	}
	
	
	
	
//	@Test
	public void doClass() {
		try(var context = new AnnotationConfigApplicationContext(AnnoDemo.class)) {
			context.getBean(AnnoDemo.class).setColor("Blue");
		}
	}
	
	
//	@Test
	public void doRegister() {
		try(var context = new AnnotationConfigApplicationContext()) {
			context.register(AnnoDemo.class);
			context.refresh();
			var bean = context.getBean(AnnoDemo.class);
			bean.setColor("Yellow!!!!");
		}
	}

}
