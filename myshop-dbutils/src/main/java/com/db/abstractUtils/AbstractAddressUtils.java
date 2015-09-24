package com.db.abstractUtils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_Address;
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
	
	public static List<Db_Address> getAddressByCustomerId(int customer_id) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where customer_id=:customer_id");
		query.setInteger("customer_id", customer_id);
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static Db_Address getAddressById(int rid) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Address address = new Db_Address();
		Query query = session.createQuery("from Db_Address where rid=:rid");
		query.setInteger("rid", rid);
		address=(Db_Address) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByCity(String city) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where city like :city");
		query.setString("city", "%"+city+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByState(String state) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where state like :state");
		query.setString("state", "%"+state+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByCountry(String country) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where country like :country");
		query.setString("country", "%"+country+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByPincode(int pincode) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where pincode=:pincode");
		query.setInteger("pincode", pincode);
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByLandmark(String landmark) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("from Db_Address where landmark like :landmark");
		query.setString("landmark", "%"+landmark+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByCustomerFname(String fname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("FROM Db_Address where customer_id in (SELECT rid from Db_Customer	 where fname like :fname)");
		query.setString("fname", "%"+fname+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}
	
	public static List<Db_Address> getAddressByCustomerLname(String lname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_Address> address = new ArrayList<Db_Address>();
		Query query = session.createQuery("FROM Db_Address where customer_id in (SELECT rid from Db_Customer	 where fname like :lname)");
		query.setString("lname", "%"+lname+"%");
		address=(List<Db_Address>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return address;
	}

}
