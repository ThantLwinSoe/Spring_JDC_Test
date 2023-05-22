package com.jdc.bean;

public class CustomService implements MyService {

	@Override
	public void doWork() {
		System.out.println("My Custom Service is running!!!");
	}

}
