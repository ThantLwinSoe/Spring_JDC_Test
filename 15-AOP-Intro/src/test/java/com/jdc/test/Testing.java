package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.business.BusinessInterface;
import com.jdc.business.TwoBusiness;

@SpringJUnitConfig(locations = {"classpath:/context.xml"})
public class Testing {
	
	@Autowired
	private BusinessInterface business;
	
	@Autowired
	private TwoBusiness twoBusiness;
	
	@Test
	public void doTest() {
		business.doBusiness();
		twoBusiness.doWork();
	}

}
