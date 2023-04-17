package com.example.claims_crud.service;

import com.example.claims_crud.entity.ClaimEntity;
import com.example.claims_crud.exception.DatabaseException;
import com.example.claims_crud.repository.ClaimCrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CrudService {

    private final ClaimCrudRepository repository;

    public List<ClaimEntity> getClaims() {
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw new DatabaseException(ex.getMessage());
        }
    }
}
