package com.lara.feignclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private ProxyForServerApp proxyForServerApp;
	
	@GetMapping("/sayHello")
	public String sayHello()
	{
		System.out.println("from feign-client-app - sayHello()");
		return "from feign-client-app - sayHello() == >"+proxyForServerApp.callTest1();
	}
	

}
