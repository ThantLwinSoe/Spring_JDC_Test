package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.bean.Client;

@SpringJUnitConfig(locations = "classpath:/config.xml")
public class TestOne {

	@Autowired
	private Client client;

	@Test
	public void testing() {
		client.doProcess();
	}

}
