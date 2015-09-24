package com.db.abstractUtils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_BookingDetails;
import com.db.entities.Db_Customer;
import com.db.entities.Db_Product;
import com.db.myshop_dbutils.MySessionFactory;
@SuppressWarnings("unchecked")
public class AbstractBookingDetailsUtils {
	
	public static Db_BookingDetails getBookingByRid(int rid) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_BookingDetails booking = new Db_BookingDetails();
		Query query = session.createQuery("from Db_BookingDetails where rid= :rid");
		query.setInteger("rid", rid);
		booking=(Db_BookingDetails) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static Db_BookingDetails getBookingByBookingId(String bookingId) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_BookingDetails booking = new Db_BookingDetails();
		Query query = session.createQuery("from Db_BookingDetails where bookingId= :bookingId");
		query.setString("bookingId", bookingId);
		booking=(Db_BookingDetails) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByCustomerId(int customerId) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where customer_id=:customerId");
		query.setInteger("customerId", customerId);
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByProductId(int productId) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where product_id=:productId");
		query.setInteger("productId", productId);
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByCustomerFname(String fname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where customer_id in (select rid from Db_Customer where fname like :fname)");
		query.setString("fname", "%"+fname+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByCustomerLname(String lname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where customer_id in (select rid from Db_Customer where lname like :lname)");
		query.setString("lname", "%"+lname+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByCustomerFullName(String fname, String lname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where customer_id in (select rid from Db_Customer where fname like :fname or lname like :lname)");
		query.setString("fname", "%"+fname+"%");
		query.setString("lname", "%"+lname+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}

	public static List<Db_BookingDetails> getBookingsByProductName(String pname) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where product_id in (select rid from Db_Product where pname like :pname)");
		query.setString("pname", "%"+pname+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByProductSeller(String seller) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where product_id in (select rid from Db_Product where seller like :seller)");
		query.setString("seller", "%"+seller+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static List<Db_BookingDetails> getBookingsByBookingStatus(String bookingStatus) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		List<Db_BookingDetails> booking = new ArrayList<Db_BookingDetails>();
		Query query = session.createQuery("from Db_BookingDetails where booking_status=:bookingStatus");
		query.setString("booking_status", "%"+bookingStatus+"%");
		booking=(List<Db_BookingDetails>) query.list();

		tx.commit();
		session.close();
		factory.close();
		return booking;
	}
	
	public static Db_Customer getCustomerByBookingId(String bookingId) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Customer customer = new Db_Customer();
		Query query = session.createQuery("from Db_Customer where rid=(select customer_id from Db_BookingDetails where booking_id=:bookingId )");
		query.setString("bookingId", bookingId);
		customer=(Db_Customer) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return customer;
	}
	
	public static Db_Product getProductByBookingId(String bookingId) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_Product product = new Db_Product();
		Query query = session.createQuery("from Db_Product where rid=(select product_id from Db_BookingDetails where booking_id=:bookingId )");
		query.setString("bookingId", bookingId);
		product=(Db_Product) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return product;
	}
	
}
