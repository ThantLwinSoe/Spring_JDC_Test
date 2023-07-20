package com.jdc.beans;

public class DefaultService implements Service{

	@Override
	public void doWork() {
		System.out.println("Default Service is working!!!");
	}

}
