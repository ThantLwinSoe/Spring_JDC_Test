package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.pojo.BusTrackAnno;

public class TestAnno {
	
	@Test
	void testAnno() {
		try(var context = new AnnotationConfigApplicationContext()) {
			context.scan("com.jdc.pojo");
			context.refresh();
			
			var bean1 = context.getBean("busAnnoBean", BusTrackAnno.class);
			bean1.getBus("YBS", 58);
			var bean2 = context.getBean("busAnnoBean", BusTrackAnno.class);
			
			assertEquals(bean1, bean2);
		}
	}

}
