package com.jdc.bean;

public class Client {
	
	private MyService service;
	
//	public Client(MyService service) {
//		this.service = service;
//	}
	
	public void setHello(MyService service) {
		this.service = service;
	}
	
	public void doProcess() {
		service.doWork();
	}

}
