package com.jdc.bean;

public class CustomService implements ServiceFactory {

	@Override
	public void doWork() {
		System.out.println("Custom Service is running!!!");

	}

}
