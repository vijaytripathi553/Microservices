package com.lara.msapp2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class App2Controller {
		@RequestMapping("app2Service")
		public String app1Service()
		{
			System.out.println("App2Controller- Service");
			return"Success - from app2Service";
		}

	}



