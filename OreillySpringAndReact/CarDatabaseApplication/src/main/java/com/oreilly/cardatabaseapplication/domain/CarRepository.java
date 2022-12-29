package com.oreilly.cardatabaseapplication.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByLastName(String lastName);
    Car findById(long id);
}
