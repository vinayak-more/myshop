package com.vinayak.webstore.database.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.db.entities.Db_Order;
import com.db.entities.Db_Product;
import com.db.myshopUtils.MyshopOrderUtils;
import com.vinayak.webstore.database.CustomerDatabase;
import com.vinayak.webstore.database.OrderDatabase;
import com.vinayak.webstore.database.ProductDatabase;
import com.vinayak.webstore.domain.Order;
import com.webstore.commons.Constants;
@Repository
public class OrderDatabaseImpl implements OrderDatabase {

    @Autowired
    CustomerDatabase customerDatabase;
    
    @Autowired
    ProductDatabase productDatabase;
    
    @Override
    public void reserveOrder(Order order) {
        order.setStatus(Constants.RESERVED);
        
        Set<Db_Product> products=productDatabase.reserveProductsFromOrder(order);
        System.out.println("porduct reserved and customer added");
        Db_Order db_order=new Db_Order();
        db_order.setProducts(products);
        db_order.setOrderStatus(order.getStatus());
        db_order.setCustomer(customerDatabase.addCustomer(order.getCustomer()));
        db_order.setBookingDate(order.getOrderDate());
        MyshopOrderUtils.saveBooking(db_order);
    }
    


}
