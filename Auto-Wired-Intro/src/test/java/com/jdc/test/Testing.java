package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.beans.Client;

@SpringJUnitConfig(locations = {"classpath:/context.xml"})
public class Testing {
	
	@Autowired
	private Client client;
	
	@Test
	public void testOne() {
		client.doProcess();
	}
}
