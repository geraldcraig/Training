package com.oreilly.shopping.dao;

import com.oreilly.shopping.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThanEqual(BigDecimal price);
//    List<Product> findTop10ByNameContainsOrderByPrice(String regex);
}

