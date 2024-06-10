package com.santidele.apirest.apirest.Controllers;

import com.santidele.apirest.apirest.Repositories.ProductRepository;
import com.santidele.apirest.apirest.Entities.Product;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
@RequestMapping("/Products")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductById(@RequestParam Long param) {
        return productRepository.findById(param).orElseThrow(() -> new RuntimeException("No se econtro el producto con el ID: " + param));
    }
    
    @PostMapping
    public Product createProduct(@RequestBody Product entity) {
        return productRepository.save(entity);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product entity) {
        //TODO: process PUT request
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("No se econtro el producto con el ID: " + id));
        product.setName(entity.getName());
        product.setPrice(entity.getPrice());
        return productRepository.save(product);
    }
    
    
    
}
