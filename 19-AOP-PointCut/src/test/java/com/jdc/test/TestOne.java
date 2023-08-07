package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.admin.dto.AdminDto;
import com.jdc.bean.config.AppConfig;
import com.jdc.member.dto.MemeberDto;

@SpringJUnitConfig(classes = AppConfig.class)
public class TestOne {
	
	@Autowired
	private AdminDto adminDto;
	
	@Autowired
	private MemeberDto memberDto;
	
	@Test
	public void testing() {
		// Admin Save
		adminDto.saveSomething();
		
		// Admin Search
		adminDto.searchSomething();
		
		// Memeber Save
		memberDto.saveSomething();
		
		// Memeber Search 
		memberDto.searchSomething();
	}
}
