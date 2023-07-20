package com.jdc.beans;

public class Client {
	
	private Service service;
	
	public Client(Service service) {
		this.service = service;
	}
	
	/** For setter method auto wired 
	public void setService(Service service) {
		this.service = service;
	}
	
	**/
	
	public void doProcess() {
		service.doWork();
	}

}
