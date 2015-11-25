package com.vinayak.webstore.database;

import com.db.entities.Db_Customer;
import com.vinayak.webstore.domain.Customer;

public interface CustomerDatabase {
    
    public Db_Customer addCustomer(Customer customer);

}
