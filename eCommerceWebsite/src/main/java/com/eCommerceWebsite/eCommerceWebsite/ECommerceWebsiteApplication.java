package com.eCommerceWebsite.eCommerceWebsite;

import com.eCommerceWebsite.eCommerceWebsite.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ECommerceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceWebsiteApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(UserService userService) {
//		return args -> {
//			userService.createUser("John Doe");
//			userService.getUserById(1L);
//		};
//	}
}
