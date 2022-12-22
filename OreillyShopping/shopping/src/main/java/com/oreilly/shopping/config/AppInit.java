//package com.oreilly.shopping.config;
//
//import com.oreilly.shopping.dao.ProductRepository;
//import com.oreilly.shopping.entities.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//
//@Component
//public class AppInit implements CommandLineRunner {
//    private final ProductRepository productRepository;
//    @Autowired
//    public AppInit(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        if (productRepository.count() == 0) {
//            productRepository.save(new Product("Apple", new BigDecimal("1.99")));
//            productRepository.save(new Product("Orange", new BigDecimal("1.49")));
//            productRepository.save(new Product("Banana", new BigDecimal("0.99")));
//        }
//        productRepository.findAll().forEach(System.out::println);
//    }
//}
