package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.pojo.BusTrackXML;

public class TestXML {
	
//	@Test
	void testOne() {
		try(var context = new GenericXmlApplicationContext("classpath:context.xml")) {
			
			var bean1 = context.getBean("busBean", BusTrackXML.class);
			bean1.getBus("YBS 56");
			var bean2 = context.getBean("busBean", BusTrackXML.class);
			
			assertEquals(bean1, bean2);
		}
	}

}
