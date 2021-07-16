package com.lara.feignribbon1client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="server-app")
@RibbonClient(name="server-app", configuration= RibbonConfiguration.class)
public interface ProxyForserverapp {
	
	@GetMapping("/test1")
	public String callTest1();

}
