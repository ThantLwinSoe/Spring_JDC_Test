package com.jdc.tls.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	
	@Autowired
	private Service service;
	
	public void doProcess() {
		service.doWork();
	}

}
