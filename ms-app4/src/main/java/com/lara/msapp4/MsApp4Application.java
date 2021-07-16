package com.lara.msapp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
public class MsApp4Application {

	public static void main(String[] args) {
		SpringApplication.run(MsApp4Application.class, args);
	}
	
	@Bean
	public Sampler defsultSampler()    // Through this method for every request slueth is assigning one unique id	
	{
		return Sampler.ALWAYS_SAMPLE;
	}

}
