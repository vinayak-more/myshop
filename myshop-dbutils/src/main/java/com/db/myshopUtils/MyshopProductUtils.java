package com.db.myshopUtils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.abstractUtils.AbstractProductUtils;
import com.db.entities.Db_Product;
import com.db.myshop_dbutils.MySessionFactory;

public class MyshopProductUtils extends AbstractProductUtils {
	
	public static Db_Product getProductByTagNo(int tagNo) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Product product = new Db_Product();
		Query query = session.createQuery("from Db_Product where tagNo= :tagNo");
		query.setInteger("tagNo", tagNo);
		product=(Db_Product) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static Db_Product getProductByHeight(float height) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Product product = new Db_Product();
		Query query = session.createQuery("from Db_Product where height= :height");
		query.setFloat("height", height);
		product=(Db_Product) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}

}
