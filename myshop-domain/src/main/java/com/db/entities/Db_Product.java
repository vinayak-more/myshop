package com.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Db_Product {

	@Id
	@GeneratedValue
	@Column(name = "rid")
	private int rid;

	@Column(name = "pname")
	private String pname;

	@Column(name = "seller")
	private String seller;

	@Column(name = "base_price")
	private float basePrice;

	@Column(name = "sale_price")
	private float salePrice;

	@Column(name = "discount")
	private float discount;

	@Column(name = "discount_in_percent")
	private float discountInPercent;

	@Column(name = "rating")
	private float rating;

	@Column(name = "tag_no")
	private int tagNo;

	@Column(name = "rack_no")
	private int rackNo;

	@Column(name = "height")
	private float height;

	@Column(name = "description")
	private String description;

	@Column(name = "catagory")
	private String catagory;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getDiscountInPercent() {
		return discountInPercent;
	}

	public void setDiscountInPercent(float discountInPercent) {
		this.discountInPercent = discountInPercent;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getTagNo() {
		return tagNo;
	}

	public void setTagNo(int tagNo) {
		this.tagNo = tagNo;
	}

	public int getRackNo() {
		return rackNo;
	}

	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

}
