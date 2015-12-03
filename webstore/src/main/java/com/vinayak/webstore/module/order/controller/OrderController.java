package com.vinayak.webstore.module.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.webstore.domain.Customer;
import com.vinayak.webstore.module.order.service.OrderService;
import com.vinayak.webstore.module.product.exception.ProductNotFoundException;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/P1234/2")
    public String process() {
        orderService.processOrder("P1234", 2);
        return "redirect:/products";
    }

    @RequestMapping("/{productId}")
    public String orderProductByPrdocutId(Model model, @PathVariable("productId") String productId) {
        if (orderService.isProductExists(productId)) {
            orderService.processOrder(productId);
            Customer customerDetails = new Customer();
            model.addAttribute("customerDetails", customerDetails);
            return "/step1";
        }else{
            throw new ProductNotFoundException(productId);
        }
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.POST)
    public String processCustomerDetailsForm(@ModelAttribute("customerDetails") Customer customer) {
        orderService.processCustomerDetails(customer);
        System.out.println(customer);
        return "/step2";
    }
}
