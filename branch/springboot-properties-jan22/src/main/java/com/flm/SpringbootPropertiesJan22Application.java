package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"jdbc.properties"})
public class SpringbootPropertiesJan22Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPropertiesJan22Application.class, args);
	}

}
