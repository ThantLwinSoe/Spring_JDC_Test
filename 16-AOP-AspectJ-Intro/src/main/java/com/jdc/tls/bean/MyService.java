package com.jdc.tls.bean;

import org.springframework.stereotype.Component;

@Component("hello")
public class MyService {
	
	public void doWork() {
		System.out.println("My Service is working!!!");
	}

}
