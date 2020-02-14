package com.ada.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootPoc {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPoc.class, args);
	}

}
