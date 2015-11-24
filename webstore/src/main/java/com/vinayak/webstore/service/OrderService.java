package com.vinayak.webstore.service;

import com.vinayak.webstore.domain.Customer;

public interface OrderService {
    
    void processOrder(String productId);

    void processOrder(String productId, int count);

    void processCustomerDetails(Customer customer);
}
