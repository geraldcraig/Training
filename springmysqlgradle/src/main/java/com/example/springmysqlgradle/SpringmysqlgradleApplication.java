package com.example.springmysqlgradle;

import com.example.springmysqlgradle.model.Person;
import com.example.springmysqlgradle.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringmysqlgradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmysqlgradleApplication.class, args);
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
