package com.oreilly.shopping.controllers;

import com.oreilly.shopping.entities.Product;
import com.oreilly.shopping.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductRestController {
    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable int id) {
        return ResponseEntity.of(productService.findProductById(id));
    }

    @PutMapping("/products/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product updateOrInsertProduct(@PathVariable Integer id, @RequestBody Product newProduct) {
        return  productService.findProductById(id).map(product -> {
                product.setName(newProduct.getName());
                product.setPrice(newProduct.getPrice());
                return productService.saveProduct(product);
        }).orElseGet(() -> {
            newProduct.setId(id);
            return  productService.saveProduct(newProduct);
        });
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> saveProduct(@RequestBody @Valid Product product) {
        Product saved = productService.saveProduct(product);
        URI location = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(saved.getId())
                .toUri();
        return ResponseEntity.created(location).body(saved);

    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        Optional<Product> existingProduct = productService.findProductById(id);
        if (existingProduct.isPresent()) {
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
