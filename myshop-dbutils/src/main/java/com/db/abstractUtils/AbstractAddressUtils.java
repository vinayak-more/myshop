package com.db.abstractUtils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_Address;
import com.db.entities.Db_Product;
import com.db.myshop_dbutils.MySessionFactory;
@SuppressWarnings("unchecked")
public class AbstractAddressUtils {

	public static void insertAddress(Db_Address address) {
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		tx.begin();

		session.persist(address);

		tx.commit();
		session.close();
		factory.close();

	}
	
	public static List<Db_Product> getAddressByCustomerId(int customer_id) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from address where customer_id=:customer_id");
		query.setInteger("customer_id", customer_id);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}

}
