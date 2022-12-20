package com.example.persistence.dao;

import com.example.persistence.entities.Officer;

import java.util.List;
import java.util.Optional;

public interface OfficerDAO {
    Officer save(Officer officer);
    Optional<Officer> findById(Integer id);
    List<Officer> findByAll();
    long count();
    void delete(Officer officer);
    boolean existsById(Integer id);
}
