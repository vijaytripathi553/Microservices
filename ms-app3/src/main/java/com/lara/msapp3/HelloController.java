package com.lara.msapp3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private ProxyFormsapp4 proxyFormsapp4;
	
	@GetMapping("sayHello")
	public String sayHello()
	{
		
		// In order to print unique id through console try defining Logger in the HelloControoler . It should be slf4j
		// This 2 line you can define anywhere wherever you want to print unique id
		Logger logger=LoggerFactory.getLogger(getClass());
		logger.info("{}","Logger message from ms-app3 sayHello() service");
		
		
		String result=proxyFormsapp4.callTest();
		
		
		
		System.out.println("from ms3-sayHello()");
		return"from ms3-sayHello()==>"+result;
	}

}
