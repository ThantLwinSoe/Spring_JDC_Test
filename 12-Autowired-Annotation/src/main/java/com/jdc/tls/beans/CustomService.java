package com.jdc.tls.beans;

import org.springframework.stereotype.Component;

@Component
public class CustomService implements Service{

	@Override
	public void doWork() {
		
		System.out.println("Curstom Service is working!!!");
	}

}
