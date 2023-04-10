package com.example.springh2;

import com.example.springh2.model.Person;
import com.example.springh2.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springh2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springh2Application.class, args);
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
