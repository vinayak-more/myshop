package com.db.entities;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_master")
public class Db_Order {

    
    @Id
    @GeneratedValue
    @Column(name = "rid")
    private int rid;

    @Column(name = "booking_id")
    private int orderId;
    
    /*@GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="customer"))
    @Column(name = "customer_id")
    private int customerId;
*/
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Db_Customer customer;
    
    /*@Column(name = "product_id")
    private int productId;*/

    @Column(name = "booking_date")
    private Timestamp bookingDate;

    @Column(name = "delievery_date")
    private Timestamp delieveryDate;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "amount_paid")
    private float amountPaid;

    @Column(name = "amount_balanced")
    private float amountBalanced;

    @Column(name = "discount_given")
    private float discountGiven;

    @Column(name = "discount_in_percent")
    private float discointInPercent;

    @Column(name = "booking_status")
    private String orderStatus;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Db_Product> products = new HashSet<Db_Product>();

    
    public Set<Db_Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Db_Product> products) {
        this.products = products;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /*public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }*/

    /*public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }*/

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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Db_Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Db_Customer customer) {
        this.customer = customer;
    }
    
    


}
