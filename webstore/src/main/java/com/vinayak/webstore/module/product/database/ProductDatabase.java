package com.vinayak.webstore.module.product.database;

import java.util.List;
import java.util.Set;

import com.db.entities.Db_Product;
import com.vinayak.webstore.domain.Order;
import com.vinayak.webstore.domain.Product;

public interface ProductDatabase {
    
    public void addProductToDatabase(Product product);
    
    public List<Product> getAllProducts();

    public Set<Db_Product> reserveProductsFromOrder(Order order);

}
