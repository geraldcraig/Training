package com.example.springh2gradle;

import com.example.springh2gradle.model.Person;
import com.example.springh2gradle.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springh2gradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springh2gradleApplication.class, args);
    }

    @Bean
    public CommandLineRunner persons(PersonRepository personRepository) {
        return (args -> {
            personRepository.save(new Person("Walter", "White", 52));
            personRepository.save(new Person("Jesse", "Pinkman", 25));
            personRepository.save(new Person("Saul", "Goodman", 40));
        });
    }

}
