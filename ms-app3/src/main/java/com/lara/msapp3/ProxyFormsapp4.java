package com.lara.msapp3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="msapp4",url="http://localhost:9091")
public interface ProxyFormsapp4 {
	@GetMapping("test1")
	public String callTest();

}
