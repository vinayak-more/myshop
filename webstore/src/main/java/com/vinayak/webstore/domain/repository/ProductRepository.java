package com.vinayak.webstore.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vinayak.webstore.domain.Product;

public interface ProductRepository {
    
    List<Product> getAllProducts();
    
    List<Product> getProductsByCategory(String category);
    
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    
    Product getProductById(String productId);
    
    void addProduct(Product product);

}
