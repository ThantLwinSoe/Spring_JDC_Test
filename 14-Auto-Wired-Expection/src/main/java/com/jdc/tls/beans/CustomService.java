package com.jdc.tls.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Qualifier("custom")
public class CustomService implements Service{

	@Override
	public void doWork() {
		System.out.println("Custom Service is running!!!");
		
	}

}
