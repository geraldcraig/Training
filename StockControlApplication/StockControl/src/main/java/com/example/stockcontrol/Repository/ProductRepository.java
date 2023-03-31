package com.example.stockcontrol.Repository;

import com.example.stockcontrol.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "index")
public interface ProductRepository extends MongoRepository<Product, String> {
}
