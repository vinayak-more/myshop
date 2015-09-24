package com.db.abstractUtils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import com.db.entities.Db_Customer;
import com.db.myshop_dbutils.MySessionFactory;
@SuppressWarnings("unchecked")
public class AbstractCustomerUtils {

	public static void insertCustomer(Db_Customer customer) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		session.persist(customer);

		tx.commit();
		session.close();
		factory.close();

	}

	public static Db_Customer getCustomerById(int rid) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Customer customer = new Db_Customer();
		Query query = session.createQuery("from customer where rid= :rid");
		query.setInteger("rid", rid);
		customer=(Db_Customer) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	

	public static List<Db_Customer> getCustomerByFname(String fname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Customer> customer = new ArrayList<Db_Customer>();
		Query query = session.createQuery("from customer where fname= :fname");
		query.setString("fname", fname);
		customer=(List<Db_Customer>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	
	public static List<Db_Customer> getCustomerByLname(String lname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Customer> customer = new ArrayList<Db_Customer>();
		Query query = session.createQuery("from customer where lname= :lname");
		query.setString("lname", lname);
		customer=(List<Db_Customer>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	
	public static List<Db_Customer> getCustomerByMobile(String mobile) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Customer> customer = new ArrayList<Db_Customer>();
		Query query = session.createQuery("from customer where mobile= :mobile");
		query.setString("mobile", mobile);
		customer=(List<Db_Customer>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	
	public static List<Db_Customer> getCustomerByUsername(String username) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Customer> customer = new ArrayList<Db_Customer>();
		Query query = session.createQuery("from customer where username= :username");
		query.setString("username", username);
		customer=(List<Db_Customer>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	
	public static boolean updateCustomerFnameById(int rid, String fname){
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		Query query = session.createQuery("UPDATE customer set fname=:fname where rid=:rid");
		query.setString("fname", fname);
		query.setInteger("rid", rid);
		int rowsUpdated=query.executeUpdate();
		
		
		tx.commit();
		session.close();
		factory.close();
		return rowsUpdated>=1?true:false;
		
	}
	
	public static boolean updateCustomerFnameByUsername(String username, String fname){
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();
		
		Query query = session.createQuery("UPDATE customer set fname=:fname where username=:username");
		query.setString("fname", fname);
		query.setString("username", username);
		int rowsUpdated=query.executeUpdate();
		
		
		tx.commit();
		session.close();
		factory.close();
		return rowsUpdated>=1?true:false;
		
	}

}
