package com.vinayak.webstore.database;

import java.util.List;

import com.vinayak.webstore.domain.Product;

public interface ProductDatabase {
    
    public void addProductToDatabase(Product product);
    
    public List<Product> getAllProducts();

}
