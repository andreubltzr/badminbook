package com.example.badminbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
		exclude = {SecurityAutoConfiguration.class} // Security currently disabled in development
)
public class BadminbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadminbookApplication.class, args);
	}

}
