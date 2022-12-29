package com.oreilly.cardatabaseapplication;

import com.oreilly.cardatabaseapplication.domain.Car;
import com.oreilly.cardatabaseapplication.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarDatabaseApplication {

    private static final Logger log = LoggerFactory.getLogger(CarDatabaseApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(CarDatabaseApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return (args) -> {
            repository.save(new Car("David", "Jones", "me@me.com", "2005"));
            repository.save(new Car("Miles", "Davis", "me2@me.com", "2019"));

            log.info("Cars found with findAll():");
            log.info("---------------------------");
            for (Car car : repository.findAll()) {
                log.info(car.toString());
            }
            log.info("");
        };
    }

}
