package com.db.abstractUtils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_User;
import com.db.myshop_dbutils.MySessionFactory;

public class AbstractUserUtils {
	
	public static void insertuser(Db_User user) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		session.persist(user);

		tx.commit();
		session.close();
		factory.close();

	}
	public static Db_User getuserById(int rid) {

		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_User user = new Db_User();
		Query query = session.createQuery("from Db_User where rid= :rid");
		query.setInteger("rid", rid);
		user=(Db_User) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return user;
	}
	
	public static Db_User getuserByUsername(String username) {

        SessionFactory factory = MySessionFactory.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        
        tx.begin();

        Db_User user = new Db_User();
        Query query = session.createQuery("from Db_User where username= :username");
        query.setString("username", username);
        user= (Db_User) query.uniqueResult();

        tx.commit();
        session.close();
        factory.close();
        return user;
    }
	public static Db_User getuserByUsernameAndPassword(String username, String password) {

        SessionFactory factory = MySessionFactory.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.getTransaction();
        
        tx.begin();

        Db_User user = new Db_User();
        Query query = session.createQuery("from Db_User where username= :username and password=:password");
        query.setString("username", username);
        query.setString("password", password);
        user= (Db_User) query.uniqueResult();

        tx.commit();
        session.close();
        factory.close();
        return user;
    }


}
