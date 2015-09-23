package com.db.myshop_dbutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@SuppressWarnings("deprecation")
public class MySessionFactory {
	
	public static SessionFactory getSessionFactory(){
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
	    return factory;
	}

}
