package com.jdc.bean;

public class ClientFactory {
	
	public MyClient generate(ServiceFactory service) {
		var client = new MyClient(service);
		return client;
	}
	
	
}
