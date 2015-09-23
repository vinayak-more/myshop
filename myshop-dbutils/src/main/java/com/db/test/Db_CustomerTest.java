package com.db.test;

import com.db.abstractUtils.AbstractCustomerUtils;

class Db_CustomerTest {
	public static void main(String[] args) {
		/*Employee e1 = new Employee();
		e1.setId(1001);
		e1.setFirstName("sonoo");
		e1.setLastName("jaiswal");

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstName("vimal");
		e2.setLastName("jaiswal");*/
		
		/*Db_Customer c1= new Db_Customer();
		c1.setFname("Vinayak");
		c1.setLname("More");
		c1.setMobile("7208467350");
		c1.setUsername("vinayak");
		c1.setPassword("infi@123");

		Db_Customer c11= new Db_Customer();
		c11.setFname("Mukesh");
		c11.setLname("More");
		c11.setMobile("8828070114");
		c11.setUsername("mukesh");
		c11.setPassword("infi@123");
		
		AbstractCustomerUtils.insertCustomer(c1);
		AbstractCustomerUtils.insertCustomer(c11);*/
		
		System.out.println(AbstractCustomerUtils.updateCustomerFnameById(1, "Vinay"));
		System.out.println(AbstractCustomerUtils.updateCustomerFnameByUsername("vinayak", "Ram"));
		System.out.println(AbstractCustomerUtils.updateCustomerLnameById(2, "Jadhaw"));
		System.out.println(AbstractCustomerUtils.updateCustomerLnameByUsername("mukesh", "Shinde"));
		System.out.println(AbstractCustomerUtils.updateCustomerFnameById(5, "Lucky"));
		System.out.println(AbstractCustomerUtils.updateCustomerMobileByUsername("mukesh", "8888888888"));

		System.out.println("successfully saved");
	}
}
