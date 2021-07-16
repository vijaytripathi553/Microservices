package com.lara.feignribbon1client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private ProxyForserverapp proxyForServerApp;
	
	@GetMapping("/hello1")
	public String hello1()
	{
		System.out.println("from feign-ribbon-client- hello1() service");
		return "from feign-ribbon-client- hello1() service"+proxyForServerApp.callTest1();
	}

}
