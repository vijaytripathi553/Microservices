package com.lara.msapp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("test1")
	public String test1()
	{
		
		
		// In order to print unique id through console try defining Logger in the TestControoler . It should be slf4j
				// This 2 line you can define anywhere wherever you want to print unique id
				Logger logger=LoggerFactory.getLogger(getClass());
				logger.info("{}","Logger message from ms-app4 test1() service");
				
				
				
				
		System.out.println("from ms4-test1()");
		return"from ms4-test1()";
	}

}
