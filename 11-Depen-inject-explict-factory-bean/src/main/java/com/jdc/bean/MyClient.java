package com.jdc.bean;

public class MyClient {
	
	private ServiceFactory service;
	
	public MyClient(ServiceFactory service) {
		this.service = service;
	}
	
	public void doProcess() {
		service.doWork();
	}

}
