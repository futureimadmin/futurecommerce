package com.example.productcatalogservice.service;

import com.example.productcatalogservice.model.Product;
import com.example.productcatalogservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id); // Ensure the ID is set for updating
            return productRepository.save(product);
        } else {
            return null; // Or throw an exception
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}