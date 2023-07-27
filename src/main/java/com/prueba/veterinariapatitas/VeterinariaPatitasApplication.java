package com.prueba.veterinariapatitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VeterinariaPatitasApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VeterinariaPatitasApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaPatitasApplication.class, args);
	}
}

