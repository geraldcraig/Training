package com.example.stockcontrol.Service;

import com.example.stockcontrol.Model.Product;
import com.example.stockcontrol.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

//    public Product getProductById(String id) {
//        return  productRepository.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));
//    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

//    public Product updateProduct(String id, Product product) {
//        Product existingProduct = getProductById(id);
//        existingProduct.setName(product.getName());
//        existingProduct.setDescription(product.getDescription());
//        existingProduct.setPrice(product.getPrice());
//        existingProduct.setStock(product.getStock());
//        return productRepository.save(existingProduct);
//    }
//
//    public void deleteProduct(String id) {
//        getProductById(id);
//        productRepository.deleteById(id);
//    }

}
