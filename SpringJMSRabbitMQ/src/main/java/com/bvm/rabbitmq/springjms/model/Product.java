package com.bvm.rabbitmq.springjms.model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -8352514755855159052L;

	private String productName;
	private String productId;
	private int quantity;

	public Product() {

	}

	public Product(String productName, String productId, int quantity) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}