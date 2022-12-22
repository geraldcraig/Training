package com.oreilly.shopping.controllers;

import com.oreilly.shopping.entities.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductRestControllerTest {

    @Autowired
    private WebTestClient client;

    @Test
    void findAllProducts() {
        client.get().uri("/products")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$[0].name").isEqualTo("Apple")
                .jsonPath("$[1].name").isEqualTo("Orange")
                .jsonPath("$[2].name").isEqualTo("Banana");
    }

    @Test
    void findProductThatExists() {
        client.get().uri("/products/1")
                .exchange()
                .expectStatus().isOk()
                .expectBody(Product.class)
                .consumeWith(result -> {
                    Product product = result.getResponseBody();
                    assertNotNull(product);
                    assertEquals("Apple", product.getName());
                });
    }

    @Test
    void findProductThatDoesNotExist() {
        client.get().uri("/products/99")
                .exchange()
                .expectStatus().isNotFound();
    }
}