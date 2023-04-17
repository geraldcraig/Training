package com.example.claims_crud.repository;

import com.example.claims_crud.entity.ClaimEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClaimCrudRepository extends CrudRepository<ClaimEntity, String> {

    List<ClaimEntity> findAll();
}
