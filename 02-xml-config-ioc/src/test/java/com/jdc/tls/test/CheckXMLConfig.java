package com.jdc.tls.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.tls.TestConfigXML;

public class CheckXMLConfig {
	
	@Test
	public void doGXA() {
		
		try(var context = new GenericXmlApplicationContext()){
			
			context.load("file:context.xml");
			context.refresh();
			
			var bean = context.getBean(TestConfigXML.class);
			bean.callName("TLS");
		}
		
	}
	
//	@Test
	public void doCPA() {
		
		try(var context = new ClassPathXmlApplicationContext("classpath:context.xml")) {
			
			context.refresh();
			
			var bean = context.getBean(TestConfigXML.class);
			bean.callName("THL");
		}
		
	}
	
//	@Test
	public void doFXA() {
		try(var context = new FileSystemXmlApplicationContext("file:context.xml")) {
			var bean = context.getBean(TestConfigXML.class);
			bean.callName("Thet");
		}
	}

}
