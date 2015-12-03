package com.vinayak.webstore.module.cart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinayak.webstore.domain.Cart;
import com.vinayak.webstore.module.cart.repository.CartRepository;
import com.vinayak.webstore.module.cart.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	public Cart create(Cart cart) {
		return cartRepository.create(cart);
	}

	public Cart read(String cartId) {
		return cartRepository.read(cartId);
	}

	public void update(String cartId, Cart cart) {
		cartRepository.update(cartId, cart);
	}

	public void delete(String cartId) {
		cartRepository.delete(cartId);
	}

}
