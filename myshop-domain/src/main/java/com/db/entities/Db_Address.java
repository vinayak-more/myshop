package com.db.entities;

import javax.persistence.*;
/**This class maps myshop.address table from database
 * Uses Hibernate configurations for data access from database
 * Use Db_Address as table name in HQL 
 * @author Vinayak
 * @since 23/09/2015
 */
@Entity
@Table(name="address")
public class Db_Address {
	/**
	 * Maps myshop.address.rid column
	 * Primary key, auto generated and not null
	 * {@link Db_Address#setRid(int)}
	 * {@link Db_Address#getRid()}
	 */
	@Id
	@GeneratedValue
	@Column(name="rid")
	protected int rid;
	
	/**
	 * Maps myshop.address.customer_id column
	 * Stores customer_id of customer from myshop.customer whose address is stored.
	 * {@link Db_Address#setCustomerId(int)}
	 * {@link Db_Address#getCustomerId()}
	 */
	@Column(name="customer_id")
	protected int customerId;
	
	/**
	 * Maps myshop.address.address_line_1 column
	 * stores address_line_1 which can be Room No., Complex of Society name
	 * {@link Db_Address#setAddressLine1(String)}
	 * {@link Db_Address#getAddressLine1()}
	 */
	@Column(name="address_line_1")
	protected String addressLine1;
	
	/**
	 * Maps myshop.address.address_line_2 column
	 * Stores address_line_2 which is Street/Road name, Area , Region
	 * {@link Db_Address#setAddressLine2(String)}
	 * {@link Db_Address#getAddressLine2()}
	 */
	@Column(name="address_line_2")
	protected String addressLine2;
	
	/**
	 * Maps myshop.address.city column
	 * Stores city name
	 * {@link Db_Address#setCity(String)}
	 * {@link Db_Address#getCity()}
	 */
	@Column(name="city")
	protected String city;
	
	/**
	 * Maps myshop.address.state
	 * Stores state name
	 * {@link Db_Address#setState(String)}
	 * {@link Db_Address#getState()}
	 */
	@Column(name="state")
	protected String state;
	
	/**
	 * Maps myshop.address.pin_code
	 * Stores pin code
	 * {@link Db_Address#setPinCode(int)}
	 * {@link Db_Address#getPinCode()}
	 */
	@Column(name="pin_code")
	protected int pinCode;
	
	/**
	 * Maps myshop.address.country
	 * Stores country
	 * {@link Db_Address#setCountry(String)}
	 * {@link Db_Address#getCountry()}
	 */
	@Column(name="country")
	protected String country;
	
	/**
	 * Maps myshop.address.landmark
	 * Stores landmark
	 * {@link Db_Address#setLandmark(String)}
	 * {@link Db_Address#getLandmark()}
	 */
	@Column(name="landmark")
	protected String landmark;
	
	/**
	 * Maps myshop.address.address_type
	 * Stores AddressType, Default is Home. It can Be Home, office or commercial
	 * {@link Db_Address#setCountry(String)}
	 * {@link Db_Address#getCountry()}
	 */
	@Column(name="address_type")
	protected String addressType;
	
	
	/**
	 * @return RowId {@link Db_Address#rid}
	 */
	public int getRid() {
		return rid;
	}
	/**
	 * @param rowId {@link Db_Address#rid}
	 */
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	/**
	 * @return customerId {@link Db_Address#customerId}
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * @param cusitomerId {@link Db_Address#customerId}
	 */
	public void setCustomerId(int cusitomerId) {
		this.customerId = cusitomerId;
	}
	/**
	 * @return addressLine1 {@link Db_Address#addressLine1}
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 {@link Db_Address#addressLine1}
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return addressLine2 {@link Db_Address#addressLine2}
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 {@link Db_Address#addressLine2}
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return city {@link Db_Address#city}
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city {@link Db_Address#city}
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return state {@link Db_Address#state}
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state {@link Db_Address#state}
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return pinCode {@link Db_Address#pinCode}
	 */
	public int getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode {@link Db_Address#pinCode}
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return country {@link Db_Address#country}
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country {@link Db_Address#country}
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return landmark {@link Db_Address#landmark}
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark {@link Db_Address#landmark}
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	/**
	 * @return addressType {@link Db_Address#addressType}
	 */
	public String getAddressType() {
		return addressType;
	}
	/**
	 * @param addressType {@link Db_Address#addressType}
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	

}
