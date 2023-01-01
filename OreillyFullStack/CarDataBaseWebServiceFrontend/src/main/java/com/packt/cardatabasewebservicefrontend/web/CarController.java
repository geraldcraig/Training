package com.packt.cardatabasewebservicefrontend.web;

import com.packt.cardatabasewebservicefrontend.domain.Car;
import com.packt.cardatabasewebservicefrontend.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }
}
