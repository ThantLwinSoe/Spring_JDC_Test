package com.jdc.bean;

public class Client {
	
	private Service service;
	
	public Client(Service service) {
		this.service = service;
	}
	
	public void doProcess() {
		service.doWork();
	}

}
