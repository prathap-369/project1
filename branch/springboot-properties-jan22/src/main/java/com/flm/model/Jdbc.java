package com.flm.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Jdbc {
	
	@Value("${driver}")
	private String driver;
	
	@Value("${user}")
	private String username;
	
	@Value("${spring.application.name}")
	private String appName;

	public void a(){
		system.out.println("okk")
	}
}
