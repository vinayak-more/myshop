package com.vinayak.webstore.module.order.service;

import com.vinayak.webstore.domain.Customer;

public interface OrderService {
    
    void processOrder(String productId);

    void processOrder(String productId, int count);

    void processCustomerDetails(Customer customer);

    boolean isProductExists(String productId);
}
