package com.example.stockcontrol.Repository;

import com.example.stockcontrol.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


//@RepositoryRestResource(collectionResourceRel = "product", path = "index")
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
