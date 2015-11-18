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
	
	public static void saveProduct(Db_Product product){
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		session.save(product);

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
		Query query = session.createQuery("from Db_Product where rid= :rid");
		query.setInteger("rid", rid);
		product=(Db_Product) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getAllProducts() {

        SessionFactory factory = MySessionFactory.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        
        tx.begin();

        List<Db_Product> product = new ArrayList<Db_Product>();
        Query query = session.createQuery("from Db_Product");
        product=(List<Db_Product>) query.list();

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
		Query query = session.createQuery("from Db_Product where pname like :pname");
		query.setString("pname", "%"+pname+"%");
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
		Query query = session.createQuery("from Db_Product where seller like :seller");
		query.setString("seller", "%"+seller+"%");
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
		Query query = session.createQuery("from Db_Product where seller like :catagory");
		query.setString("catagory", "%"+catagory+"%");
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsByBasePriceInRange(float low,float high) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from Db_Product where base_price>=:low and base_price<=:high");
		query.setFloat("low", low);
		query.setFloat("high", high);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsBySalePriceInRange(float low,float high) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from Db_Product where sale_price>=:low and sale_price<=:high");
		query.setFloat("low", low);
		query.setFloat("high", high);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsByDiscountInRange(float low,float high) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from Db_Product where discount>=:low and discount<=:high");
		query.setFloat("low", low);
		query.setFloat("high", high);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
	public static List<Db_Product> getProductsByDiscountPercentInRange(float low,float high) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Product> product = new ArrayList<Db_Product>();
		Query query = session.createQuery("from Db_Product where discount_in_percent>=:low and discount_in_percent<=:high");
		query.setFloat("low", low);
		query.setFloat("high", high);
		product=(List<Db_Product>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}

}
