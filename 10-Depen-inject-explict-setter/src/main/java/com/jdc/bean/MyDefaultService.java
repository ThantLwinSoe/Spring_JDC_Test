package com.jdc.bean;

public class MyDefaultService implements MyService {

	@Override
	public void doWork() {
		System.out.println("My Default Service is running!!!");
	}

}
