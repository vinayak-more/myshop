package com.vinayak.webstore.database;

import org.springframework.stereotype.Repository;

import com.db.entities.Db_Customer;
import com.db.myshopUtils.MyshopCustomerUtils;
import com.vinayak.webstore.domain.Customer;

@Repository
public class CustomerDatabaseImpl implements CustomerDatabase {

    @Override
    public Db_Customer addCustomer(Customer customer) {
        Db_Customer db_customer = new Db_Customer();
        db_customer.setFname(customer.getFname());
        db_customer.setLname(customer.getLname());
        db_customer.setMobile(String.valueOf(customer.getMobileNo()));
        db_customer.setEmail(customer.getEmail());
        //MyshopCustomerUtils.insertCustomer(db_customer);
        return db_customer;
    }

}
