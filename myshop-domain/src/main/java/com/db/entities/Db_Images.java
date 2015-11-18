package com.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="images")
public class Db_Images {
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	protected int rid;
	
	@Column(name="image_path")
	private String imagePath;
	
	@ManyToOne
    @JoinColumn(name="product_id")
	private Db_Product product;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Db_Product getProduct() {
		return product;
	}

	public void setProduct(Db_Product product) {
		this.product = product;
	}

}
