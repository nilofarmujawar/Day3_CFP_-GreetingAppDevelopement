package com.bridgelabz.greetingapplication;

/**
 * import classes
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1) @SpringBootApplication :-
 *                The @SpringBootApplication annotation is a convenience annotation that combines the @EnableAutoConfiguration,
 *                @Configuration and the @ComponentScan annotations in a Spring Boot application.
 *                These annotations do the following: @EnableAutoConfiguration – This enables Spring Boot's autoconfiguration mechanism.
 */

@SpringBootApplication
/**
 * create class name as GreetingApplication
 */
public class GreetingApplication {

	/**
	 * create a main method,all program execute in main method.
	 * @param args - no arguments ,its default
	 */
	public static void main(String[] args) {
		System.out.println("Hello here.....!");
		SpringApplication.run(GreetingApplication.class, args);
	}

}
