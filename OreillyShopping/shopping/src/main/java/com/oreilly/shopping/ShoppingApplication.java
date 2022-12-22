package com.oreilly.shopping;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import com.oreilly.shopping.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class ShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner init(ProductRepository productRepository) {
//        return args -> {
//            if (productRepository.count() == 0) {
//                productRepository.save(new Product("Apple", new BigDecimal("1.99")));
//                productRepository.save(new Product("Orange", new BigDecimal("1.49")));
//                productRepository.save(new Product("Banana", new BigDecimal("0.99")));
//            }
//            productRepository.findAll().forEach(System.out::println);
//        };
//    }

    @Bean
    public CommandLineRunner init(ProductService productService) {
        return args -> {
            productService.initializeProducts().forEach(System.out::println);
        };
    }

}
