package com.jdc.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("busAnnoBean")
@Scope("prototype")
public class BusTrackAnno {
	
	public void getBus(String bus,int number) {
		System.out.println(bus + "====" + number);
	}
}
