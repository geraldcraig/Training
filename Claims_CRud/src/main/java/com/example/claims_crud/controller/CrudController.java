package com.example.claims_crud.controller;

import com.example.claims_crud.entity.ClaimEntity;
import com.example.claims_crud.service.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CrudController {

    private final CrudService service;

    @GetMapping("/api/claims")
    public List<ClaimEntity> getClaims() {
        return service.getClaims();
    }
}
