package com.vinayak.webstore.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.webstore.domain.Cart;
import com.vinayak.webstore.domain.CartItem;
import com.vinayak.webstore.domain.Customer;
import com.vinayak.webstore.domain.Order;
import com.vinayak.webstore.domain.Product;
import com.vinayak.webstore.repository.ProductRepository;
import com.vinayak.webstore.service.OrderService;
import com.webstore.commons.Constants;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;
    Order order;

    @Override
    public void processOrder(String productId, int quantity) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < quantity) {
            throw new IllegalArgumentException("Out of Stock. AvailableUnits in stock" + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
    }

    @Override
    public void processOrder(String productId) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < Constants.ONE) {
            throw new IllegalArgumentException("Out of Stock. AvailableUnits in stock" + productById.getUnitsInStock());
        } else {
            order=new Order(new Timestamp(new Date().getTime()));
            order.setCart(new Cart()); 
            order.getCart().addCartItem(new CartItem(productById));
            
        }
    }

    @Override
    public void processCustomerDetails(Customer customer) {
        order.setCustomer(customer);
    }
}
