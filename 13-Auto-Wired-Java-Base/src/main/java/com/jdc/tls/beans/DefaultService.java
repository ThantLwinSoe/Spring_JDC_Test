package com.jdc.tls.beans;

import org.springframework.stereotype.Component;

@Component
public class DefaultService implements Service{

	@Override
	public void doWork() {
		System.out.println("Default Service is running!!!");
		
	}
	
	
}
