package com.oreilly.shopping.entities;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductTest {

    @Autowired
    private Validator validator;

    @Test
    void validProduct() {
        Product product = new Product("Apple", new BigDecimal("1.99"));
        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        assertThat(violations).isEmpty();
    }

    @Test
    void blankNameIsInvalid() {
        Product product = new Product("  ", new BigDecimal("0.99"));
        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        assertThat(violations).hasSize(1);
        assertThat(violations.iterator().next().getMessage())
                .isEqualTo("Products must have a name");
    }

    @Test
    void negativePriceIsInvalid() {
        Product product = new Product("Apple", new BigDecimal("-1.99"));
        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        assertThat(violations).hasSize(1);
        assertThat(violations.iterator().next().getMessage())
                .isEqualTo("Product price must be greater than 0");
    }

}