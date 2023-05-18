package com.jdc.One;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnoBean {
	
	@Test
	void testAnno() {
		try(var context = new AnnotationConfigApplicationContext()) {
			context.scan("com.jdc.bean");
			context.refresh();
		}
	}

}
