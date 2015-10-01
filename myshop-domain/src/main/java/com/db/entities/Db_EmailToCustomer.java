package com.db.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_to_customer")
public class Db_EmailToCustomer {
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	private int rid;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="product_id")
	private int productId;
	
	@Column(name="address_id")
	private int addressId;
	
	@Column(name="email_from")
	private String emailFrom;
	
	@Column(name="email_to")
	private String emailTo;
	
	@Column(name="email_subject")
	private String emailSubject;
	
	@Column(name="email_body")
	private String emailBody;
	
	@Column(name="sent_on")
	private Timestamp sentOn;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public Timestamp getSentOn() {
		return sentOn;
	}

	public void setSentOn(Timestamp sentOn) {
		this.sentOn = sentOn;
	}

}
