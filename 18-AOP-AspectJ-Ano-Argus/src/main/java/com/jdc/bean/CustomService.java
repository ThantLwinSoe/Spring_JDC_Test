package com.jdc.bean;

import org.springframework.stereotype.Component;

@Component("two")
public class CustomService implements Service{

	@Override
	public void doWork(String name, int num) {
		System.out.println("Custom Service!!!");
		
	}

}
