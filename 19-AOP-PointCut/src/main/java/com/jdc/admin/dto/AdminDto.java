package com.jdc.admin.dto;

import org.springframework.stereotype.Component;

@Component(value = "hello")
public class AdminDto {
	
	public void searchSomething() {
		System.out.println("Admin Search!!!");
	}
	
	public void saveSomething() {
		System.out.println("Admin Save!!!");
	}

}
