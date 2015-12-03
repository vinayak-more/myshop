package com.vinayak.webstore.module.cart.service;

import com.vinayak.webstore.domain.Cart;

public interface CartService {
	Cart create(Cart cart);

	Cart read(String cartId);

	void update(String cartId, Cart cart);

	void delete(String cartId);

}
