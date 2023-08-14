package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Gives the compiler that it is spring boot application for functionalities
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//It runs above class as spring application
		SpringApplication.run(CourseApiApp.class, args);
		
		
		
	}

}
