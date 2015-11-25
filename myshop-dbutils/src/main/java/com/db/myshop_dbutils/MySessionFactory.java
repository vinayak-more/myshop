package com.db.myshop_dbutils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class MySessionFactory {

    static SessionFactory sessionFactory;

    public MySessionFactory() {
        if (sessionFactory == null) {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            MySessionFactory.sessionFactory = cfg.buildSessionFactory();
        } else if (sessionFactory.isClosed()) {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            MySessionFactory.sessionFactory = cfg.buildSessionFactory();
        }
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        MySessionFactory.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }



    /*
     * public static SessionFactory getSessionFactory(){ Configuration cfg = new Configuration();
     * cfg.configure("hibernate.cfg.xml"); SessionFactory factory = cfg.buildSessionFactory(); return factory; }
     */
}
