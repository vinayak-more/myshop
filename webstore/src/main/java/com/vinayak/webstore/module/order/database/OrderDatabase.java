package com.vinayak.webstore.module.order.database;

import com.vinayak.webstore.domain.Order;

public interface OrderDatabase {
    
    public void reserveOrder(Order order);


}
