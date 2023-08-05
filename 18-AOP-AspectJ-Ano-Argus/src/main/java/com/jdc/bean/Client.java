package com.jdc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdc.dto.Result;


@Component("one")
public class Client {
	
	@Autowired
	private Service service;
	
	
	public void doProcess(String name, int num) {
		service.doWork(name,num);
	}
	
	public Result doResult(String name, int number) {
		return new Result(name,number);
	}
	
	public int doArithmetic(int a, int b) {
		
		return a / b;
	}

}
