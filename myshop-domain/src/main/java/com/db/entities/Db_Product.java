package com.db.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Db_Product {

	@Id
	@GeneratedValue
	@Column(name = "rid")
	private int rid;

	@Column(name = "pname")
	private String pname;
	
	@Column(name = "product_id")
    private String productId;

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

	@Column(name = "description")
	private String description;

	@Column(name = "category")
	private String category;
	
	@Column(name = "manufacturer")
    private String manufacturer;
	
	@Column(name = "units_in_stock")
    private int unitsInStock;
	
	@Column(name = "units_in_order")
    private int unitsInOrder;
	
	@Column(name = "pcondition")
    private String condition;
	
	@OneToMany(mappedBy="product" ,fetch = FetchType.EAGER)
	private List<Db_Images> images;
	
	@ManyToMany(fetch=FetchType.EAGER,mappedBy="products")
	private Set<Db_Order> orders=new HashSet<Db_Order>();
	
	
	public Set<Db_Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Db_Order> orders) {
        this.orders = orders;
    }

    public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Db_Images> getImages() {
		return images;
	}

	public void setImages(List<Db_Images> images) {
		this.images = images;
	}

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

	public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder(int unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
