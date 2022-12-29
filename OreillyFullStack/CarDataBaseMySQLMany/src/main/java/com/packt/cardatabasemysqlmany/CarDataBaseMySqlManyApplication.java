package com.packt.cardatabasemysqlmany;

import com.packt.cardatabasemysqlmany.domain.Car;
import com.packt.cardatabasemysqlmany.domain.CarRepository;
import com.packt.cardatabasemysqlmany.domain.Owner;
import com.packt.cardatabasemysqlmany.domain.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CarDataBaseMySqlManyApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CarDataBaseMySqlManyApplication.class);

    @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(CarDataBaseMySqlManyApplication.class, args);
        logger.info("Application started");
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("John", "Johnson");
        Owner owner2 = new Owner("Mary", "Robinson");
        ownerRepository.saveAll(Arrays.asList(owner1, owner2));

        Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000);
        Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-0212", 2020, 39000);
        repository.saveAll(Arrays.asList(car1, car2));

        for (Car car : repository.findAll()) {
            logger.info(car.getBrand() + " " + car.getModel());

        }
    }

}
