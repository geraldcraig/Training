package com.packt.cardatabasewebservice.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByColor(@Param("color") String color);

    List<Car> findByCarYear(@Param("carYear") int carYear);

}
