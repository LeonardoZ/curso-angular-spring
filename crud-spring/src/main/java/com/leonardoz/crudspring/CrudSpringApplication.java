package com.leonardoz.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.leonardoz.crudspring.model.Course;
import com.leonardoz.crudspring.reposiroty.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDb(CourseRepository courseRepository) {
		return (args) -> {
			courseRepository.deleteAll();
			var c = new Course();
			c.setCategory("frontend");
			c.setName("Angular com Spring");
			courseRepository.save(c);
		};
	}

}
