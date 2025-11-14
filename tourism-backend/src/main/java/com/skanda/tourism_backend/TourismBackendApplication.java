package com.skanda.tourism_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TourismBackendApplication {

	public static void main(String[] args) {
		System.out.println("Tourism");
		SpringApplication.run(TourismBackendApplication.class, args);
		System.out.println("tourist-backend");
	}

}
