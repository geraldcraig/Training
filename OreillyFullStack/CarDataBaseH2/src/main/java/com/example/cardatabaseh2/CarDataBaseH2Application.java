package com.example.cardatabaseh2;

import com.example.cardatabaseh2.domain.Car;
import com.example.cardatabaseh2.domain.CarRepository;
import com.example.cardatabaseh2.domain.Owner;
import com.example.cardatabaseh2.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CarDataBaseH2Application implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CarDataBaseH2Application.class);

    @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CarDataBaseH2Application.class, args);
        logger.info("Application started");
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("John", "Johnson");
        Owner owner2 = new Owner("Mary", "Robinson");
        ownerRepository.saveAll(Arrays.asList(owner1, owner2));

        Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
        Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-0212", 2020, 39000, owner2);
        repository.saveAll(Arrays.asList(car1, car2));

        for (Car car : repository.findAll()) {
            logger.info(car.getBrand() + " " + car.getModel());
        }
    }
}
