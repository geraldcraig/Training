package com.oreilly.shopping.services;

import com.oreilly.shopping.dao.ProductRepository;
import com.oreilly.shopping.entities.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> initializeProducts() {
        if (productRepository.count() == 0) {
            productRepository.save(new Product("Apple", new BigDecimal("1.99")));
            productRepository.save(new Product("Orange", new BigDecimal("1.49")));
            productRepository.save(new Product("Banana", new BigDecimal("0.99")));
        }
        return productRepository.findAll();
    }
    @Transactional(readOnly = true)
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Product> findProductById(int id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
