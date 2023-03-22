package myy803.test3;

import myy803.test3.*;
import myy803.test3.entities.Course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Test3Application {

	public static void main(String[] args) {

		SpringApplication.run(Test3Application.class, args);
		System.out.println("############################################");
		System.out.println("app started");
		System.out.println("############################################");
		
	}

}
