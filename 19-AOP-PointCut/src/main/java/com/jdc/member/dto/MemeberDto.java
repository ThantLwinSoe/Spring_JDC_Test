package com.jdc.member.dto;

import org.springframework.stereotype.Component;

@Component(value = "mdto")
public class MemeberDto {
	
	public void searchSomething() {
		System.out.println("Member search!!!");
	}
	
	public void saveSomething() {
		System.out.println("Member Save!!!");
	}

}
