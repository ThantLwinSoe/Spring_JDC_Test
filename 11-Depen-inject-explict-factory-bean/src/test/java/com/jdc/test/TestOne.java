package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.bean.ClientFactory;
import com.jdc.bean.MyClient;

@SpringJUnitConfig(locations = "classpath:/config.xml")
public class TestOne {
	
	@Autowired
	private MyClient client;
	
	@Test
	void testing() {
		client.doProcess();
	}

}
