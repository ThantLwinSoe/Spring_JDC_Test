package com.jdc.bean;

import org.springframework.stereotype.Component;

@Component(value = "hello")
public class Client {
	
	public void doWork() {
		System.out.println("Client is Working!!!");
	}

}
