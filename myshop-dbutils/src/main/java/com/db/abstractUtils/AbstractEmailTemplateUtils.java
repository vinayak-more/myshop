package com.db.abstractUtils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.entities.Db_EmailTemplate;
import com.db.myshop_dbutils.MySessionFactory;

public class AbstractEmailTemplateUtils {
	
	public static Db_EmailTemplate getEmailTemplateByType(String emailType){
		SessionFactory factory = MySessionFactory.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		tx.begin();

		Db_EmailTemplate emailTemplate = new Db_EmailTemplate();
		Query query = session.createQuery("from Db_EmailTemplate where email_type= :email_type");
		query.setString("email_type", emailType);
		emailTemplate=(Db_EmailTemplate) query.uniqueResult();

		tx.commit();
		session.close();
		factory.close();
		return emailTemplate;
	}

}
