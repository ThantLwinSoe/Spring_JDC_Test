package com.jdc.tls.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.tls.beans.Client;
import com.jdc.tls.config.AppConfig;

@SpringJUnitConfig(classes = AppConfig.class)
public class Testing {
	
	@Autowired
	private Client client;
	
	@Test
	public void doTest() {
		client.doProcess();
	}
}
