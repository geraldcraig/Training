package com.oreilly.shopping.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void shouldBeThreeProductsInInitialDB() {
        assertThat(productRepository.count()).isEqualTo(3);
    }

    @Test
    void shouldBeTwoProductsOverOneDollar() {
        assertThat(productRepository.findAllByPriceGreaterThanEqual(new BigDecimal(1.00)).size()).isEqualTo(2);
    }

}