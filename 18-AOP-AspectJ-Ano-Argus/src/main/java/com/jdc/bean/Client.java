package com.jdc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("one")
public class Client {
	
	@Autowired
	private Service service;
	
	public void doProcess(String name, int num) {
		service.doWork(name,num);
	}

}
