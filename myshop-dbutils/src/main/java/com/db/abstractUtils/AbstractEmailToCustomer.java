package com.db.abstractUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_EmailToCustomer;
import com.db.myshop_dbutils.MySessionFactory;

public class AbstractEmailToCustomer {
    static MySessionFactory sessionfactory=new MySessionFactory();
	public static void insertSentEmail(Db_EmailToCustomer email){
		SessionFactory factory = sessionfactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		session.persist(email);

		tx.commit();
		session.close();
		
	}

}
