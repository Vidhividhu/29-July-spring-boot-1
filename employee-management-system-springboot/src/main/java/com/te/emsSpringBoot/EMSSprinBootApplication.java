package com.te.emsSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EMSSprinBootApplication {

	public static void main(String[] args) {
		System.out.println("EMSApplication");

		SpringApplication.run(EMSSprinBootApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("commandLineRunner() method is executed");
		};
	}
}
