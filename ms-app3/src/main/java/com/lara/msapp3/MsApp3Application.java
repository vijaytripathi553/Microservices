package com.lara.msapp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.lara.msapp3")
public class MsApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(MsApp3Application.class, args);
		
	}
	
	@Bean
	public Sampler defsultSampler()    // Through this method for every request slueth is assigning one unique id	
	{
		return Sampler.ALWAYS_SAMPLE;
	}

}
