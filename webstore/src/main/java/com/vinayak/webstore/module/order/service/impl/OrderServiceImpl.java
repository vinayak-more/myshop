package com.vinayak.webstore.module.order.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.webstore.domain.Cart;
import com.vinayak.webstore.domain.CartItem;
import com.vinayak.webstore.domain.Customer;
import com.vinayak.webstore.domain.Order;
import com.vinayak.webstore.domain.Product;
import com.vinayak.webstore.module.order.database.OrderDatabase;
import com.vinayak.webstore.module.order.repository.OrderRepository;
import com.vinayak.webstore.module.order.service.OrderService;
import com.vinayak.webstore.module.product.repository.ProductRepository;
import com.webstore.commons.Constants;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private OrderDatabase orderDatabase;
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
        orderDatabase.reserveOrder(order);
       
    }

    @Override
    public boolean isProductExists(String productId) {
        return productRepository.isProductExists(productId);
    }
}
