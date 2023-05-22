package com.jdc.bean;

public class MyDefaultService implements ServiceFactory{

	@Override
	public void doWork() {
		System.out.println("Default Service is Running!!!");
		
	}

}
