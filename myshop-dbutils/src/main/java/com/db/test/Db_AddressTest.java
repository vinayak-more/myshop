package com.db.test;

import com.db.abstractUtils.AbstractAddressUtils;

public class Db_AddressTest {

	public static void main(String[] args) {
		// 
		/*Db_Address address=new Db_Address();
		address.setAddressLine1("3rd Floore,High tech plaza");
		address.setAddressLine2("Mahakali caves Road, Andheri(EAST)");
		address.setCity("Mumbai");
		address.setPinCode(400093);
		System.out.println(AbstractCustomerUtils.getCustomerByFname("vinaya").get(0).getRid());
		address.setCustomerId(AbstractCustomerUtils.getCustomerByFname("vin").get(0).getRid());
		address.setAddressType("Office or Commercial");
		address.setState("Maharashtra");
		address.setCountry("India");
		
		AbstractAddressUtils.insertAddress(address);*/
		
		System.out.println(AbstractAddressUtils.getAddressByCustomerFname("vina").get(0).getAddressLine1());
		
	}

}
