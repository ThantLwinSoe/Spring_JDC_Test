package com.jdc.member.service;

import org.springframework.stereotype.Component;

@Component(value = "mservice")
public class MemberService {
	
	public void doProcess() {
		System.out.println("Member Process!!!");
	}

}
