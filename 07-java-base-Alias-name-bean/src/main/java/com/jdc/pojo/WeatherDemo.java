package com.jdc.pojo;

import org.springframework.stereotype.Component;

@Component(value = "weatherBean")
public class WeatherDemo {
	
	public void checkCloud(String condition) {
		System.out.println(condition);
	}

}
