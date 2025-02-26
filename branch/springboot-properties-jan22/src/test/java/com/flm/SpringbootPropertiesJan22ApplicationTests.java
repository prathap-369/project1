package com.flm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flm.model.Jdbc;

@SpringBootTest
class SpringbootPropertiesJan22ApplicationTests {

	@Autowired
	private Jdbc jdbc;
	
	@Test
	void testJDBC() {
		System.out.println("Driver : "+jdbc.getDriver());
		System.out.println("User Name : "+jdbc.getUsername());
		System.out.println("App Name : "+jdbc.getAppName());
	}

}
