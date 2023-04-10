package com.example.springmongogradle;

import com.example.springmongogradle.model.Person;
import com.example.springmongogradle.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringmongogradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmongogradleApplication.class, args);
    }

    @Bean
    public CommandLineRunner persons(PersonRepository personRepository) {
        return (args -> {
            personRepository.save(new Person("Walter White"));
            personRepository.save(new Person("Jesse Pinkman"));
            personRepository.save(new Person("Saul Goodman"));
        });
    }

}
