package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.bean.Client;
import com.jdc.config.AppConfig;

@SpringJUnitConfig(classes = AppConfig.class)
public class TestingOne {
	
	@Autowired
	private Client client;
	
	@Test
	public void test() {
		client.doWork();
	}
}
