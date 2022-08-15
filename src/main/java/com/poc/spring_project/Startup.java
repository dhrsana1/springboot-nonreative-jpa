package com.poc.spring_project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.poc.*")
@SpringBootApplication
@EnableJpaRepositories
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}


}
