package com.jdc.admin.service;

import org.springframework.stereotype.Component;

@Component(value = "aservice")
public class AdminService {
	
	public void doProcess() {
		System.out.println("Admin Process!!!");
	}

}
