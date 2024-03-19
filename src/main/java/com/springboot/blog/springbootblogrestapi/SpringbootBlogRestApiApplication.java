package com.springboot.blog.springbootblogrestapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot based Blog App REST APIs",
				description = "My introductory project into learning Spring Boot.",
				version = "V1.0",
				contact = @Contact(
						name = "Mohan Amritesh Dasari",
						email = "dmamritesh@gmail.com",
						url = "https://amritesh-dasari.github.io/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot based Blog App Codebase",
				url = "https://github.com/amritesh-dasari/Springboot-Blog"
		)
)
public class SpringbootBlogRestApiApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

}
