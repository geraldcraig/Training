package com.example.springh2.repository;

import com.example.springh2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
