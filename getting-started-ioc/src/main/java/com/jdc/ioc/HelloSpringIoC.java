package com.jdc.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringIoC {
	
	public void start() {
		System.out.println("IOC Container is Starting!!!!");
	}
	
	public void shutDown() {
		System.out.println("IOC Container is closing!!!!");
	}

}
