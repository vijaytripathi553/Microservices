package com.lara.feignribbon1client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.lara.feignribbon1client")
public class FeignRibbon1ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignRibbon1ClientApplication.class, args);
	}

}
