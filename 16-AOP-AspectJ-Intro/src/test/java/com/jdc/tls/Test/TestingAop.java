package com.jdc.tls.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.tls.bean.MyService;
import com.jdc.tls.config.AppConfig;

@SpringJUnitConfig(classes = AppConfig.class)
public class TestingAop {
	
	@Autowired
	private MyService myservice;
	
	@Test
	public void testing() {
		myservice.doWork();
	}

}
