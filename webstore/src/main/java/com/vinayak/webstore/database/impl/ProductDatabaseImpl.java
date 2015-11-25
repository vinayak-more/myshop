package com.vinayak.webstore.database.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.db.entities.Db_Product;
import com.db.myshopUtils.MyshopProductUtils;
import com.vinayak.webstore.database.ProductDatabase;
import com.vinayak.webstore.domain.Order;
import com.vinayak.webstore.domain.Product;

@Repository
public class ProductDatabaseImpl implements ProductDatabase {

    @Override
    public void addProductToDatabase(Product product) {
        Db_Product db_product = new Db_Product();
        db_product.setProductId(product.getProductId());
        db_product.setPname(product.getName());
        db_product.setUnitsInStock((int) product.getUnitsInStock());
        db_product.setSalePrice(product.getUnitPrice().floatValue());
        db_product.setDescription(product.getDescription());
        db_product.setManufacturer(product.getManufacturer());
        db_product.setcategory(product.getCategory());
        db_product.setUnitsInStock((int) product.getUnitsInStock());
        db_product.setCondition(product.getCondition() == null ? "old" : product.getCondition());
        MyshopProductUtils.saveProduct(db_product);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<Product>();
        List<Db_Product> db_list = MyshopProductUtils.getAllProducts();
        for (Db_Product db_Product : db_list) {
            Product product = new Product();
            product.setProductId(db_Product.getProductId());
            product.setName(db_Product.getPname());
            product.setUnitsInStock(db_Product.getUnitsInStock());
            product.setUnitPrice(new BigDecimal(db_Product.getSalePrice()));
            product.setDescription(db_Product.getDescription());
            product.setManufacturer(db_Product.getDescription());
            product.setCategory(db_Product.getcategory());
            product.setUnitsInStock(db_Product.getUnitsInStock());
            product.setCondition(db_Product.getCondition());
            product.setImagePath(db_Product.getImages().get(0).getImagePath());

            list.add(product);
        }
        return list;
    }

    @Override
    public Set<Db_Product> reserveProductsFromOrder(Order order) {
        Set<Db_Product> products = new HashSet<Db_Product>();
        for (String productId : order.getCart().getCartItems().keySet()) {
            Db_Product product = MyshopProductUtils.getProductByProductId(productId);
            product.setUnitsInStock(product.getUnitsInStock() - 1);
            MyshopProductUtils.updateProduct(product);
            products.add(product);
        }
        return products;


    }

}
