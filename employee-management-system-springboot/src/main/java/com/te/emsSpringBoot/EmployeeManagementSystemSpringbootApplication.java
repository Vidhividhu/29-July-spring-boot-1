package com.te.emsSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemSpringbootApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(){
		return args->{
			System.out.println("commandLineRunner() method is executed");
		}
}
