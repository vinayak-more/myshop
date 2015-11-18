package com.vinayak.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.webstore.domain.Product;
import com.vinayak.webstore.repository.ProductRepository;
import com.vinayak.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int quantity) {
        Product productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < quantity) {
            throw new IllegalArgumentException("Out of Stock. AvailableUnits in stock" + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
    }
}
