package com.jdc.tls.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	
/*	@Autowired
	private Service service;
*/
	private Service service;
	
	public Client(@Autowired Service service) {
		this.service = service;
	} 
	
	public void doProcess() {
		service.doWork();
	}

}
