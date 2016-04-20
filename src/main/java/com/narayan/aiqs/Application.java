package com.narayan.aiqs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @author unmattavesa
 *
 */
@SpringBootApplication(scanBasePackages = { "com.narayan.aiqs" })
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		 return (String... args) -> System.out.println("\t >>>>>>>>>>>>>>>>>>>> Hello World <<<<<<<<<<<<<<<<<<<<<<< ");
	}
	
}
