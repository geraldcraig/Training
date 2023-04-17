package com.example.claims_crud;

import com.example.claims_crud.entity.ClaimEntity;
import com.example.claims_crud.repository.ClaimCrudRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClaimsCrudApplication implements CommandLineRunner {

    private final ClaimCrudRepository repository;

    public ClaimsCrudApplication(ClaimCrudRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClaimsCrudApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new ClaimEntity(1, "00000001", "1", "17 Apr 23", "cool user", "N"));

    }
}
