package com.db.entities;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_details")
public class Db_BookingDetails {
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	private int rid;
	
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="booking_date")
	private Timestamp bookingDate;
	
	@Column(name="delievery_date")
	private Timestamp delieveryDate;
	
	@Column(name="payment_method")
	private String paymentMethod;
	
	@Column(name="amount_paid")
	private float amountPaid;
	
	@Column(name="amount_balanced")
	private float amountBalanced;
	
	@Column(name="discount_given")
	private float discountGiven;
	
	@Column(name="discount_in_percent")
	private float discointInPercent;
	
	@Column(name="booking_status")
	private String bookingStatus;
	
	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Timestamp getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Timestamp getDelieveryDate() {
		return delieveryDate;
	}

	public void setDelieveryDate(Timestamp delieveryDate) {
		this.delieveryDate = delieveryDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public float getAmountBalanced() {
		return amountBalanced;
	}

	public void setAmountBalanced(float amountBalanced) {
		this.amountBalanced = amountBalanced;
	}

	public float getDiacountGiven() {
		return discountGiven;
	}

	public void setDiacountGiven(float diacountGiven) {
		this.discountGiven = diacountGiven;
	}

	public float getDiscointInPercent() {
		return discointInPercent;
	}

	public void setDiscointInPercent(float discointInPercent) {
		this.discointInPercent = discointInPercent;
	}

	public float getDiscountGiven() {
		return discountGiven;
	}

	public void setDiscountGiven(float discountGiven) {
		this.discountGiven = discountGiven;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	

}
