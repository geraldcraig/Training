package com.packt.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarDataBaseApplication {
    private static final Logger logger = LoggerFactory.getLogger(CarDataBaseApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarDataBaseApplication.class, args);
        logger.info("Application started");
    }

}
