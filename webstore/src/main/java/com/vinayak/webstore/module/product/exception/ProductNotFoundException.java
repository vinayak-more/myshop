package com.vinayak.webstore.module.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No products found for this product id")
public class ProductNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -694354952032299587L;
	private String productId;

	public ProductNotFoundException(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}
}
