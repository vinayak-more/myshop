package com.db.abstractUtils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_Product;
import com.db.myshop_dbutils.MySessionFactory;
@SuppressWarnings("unchecked")
public class AbstractProductUtils {
	
	public static void insertProduct(Db_Product product){
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		session.persist(product);

		tx.commit();
		session.close();
		factory.close();
		
	}
	
	public static Db_Product getProductById(int rid) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Product product = new Db_Product();
		Query query = session.createQuery("from product where rid= :rid");
		query.setInteger("rid", rid);
		product=(Db_Product) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsByPname(String pname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from product where pname like %:pname%");
		query.setString("pname", pname);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsBySeller(String seller) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from product where seller like %:seller%");
		query.setString("seller", seller);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsByCatagory(String catagory) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from product where seller like %:catagory%");
		query.setString("catagory", catagory);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}

}
