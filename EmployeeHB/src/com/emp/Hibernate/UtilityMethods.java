package com.emp.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;


public class UtilityMethods {
	
	public boolean isDeptPresent(String dept)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
         
        org.hibernate.Query query = session.createQuery("from Dept where name= :name");
        query.setString("name", dept);
        
        Dept deptRow = (Dept) query.uniqueResult();
        session.close();
        factory.close();
      if(deptRow!=null)
		return true;
      else {
    	  return false;
	}

	}
	
	public void addDept(String dept)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
       Dept newDept=new Dept();
       newDept.setName(dept);
       Transaction tx=session.beginTransaction();
       session.persist(newDept);
       tx.commit();
       session.close();
        factory.close();
       // return newDept.id;
	}
	
	public Dept getDept(String dept)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
         
        org.hibernate.Query query = session.createQuery("from Dept where name= :name");
        query.setString("name", dept);
        
        Dept deptRow = (Dept) query.uniqueResult();
        session.close();
        factory.close();
        return deptRow;
	}
	public int getDeptId(String dept)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
         
        org.hibernate.Query query = session.createQuery("from Dept where name= :name");
        query.setString("name", dept);
        
        Dept deptRow = (Dept) query.uniqueResult();
        session.close();
        factory.close();
        return deptRow.id;
	}
	
	public void addEmployee(String name, Dept dept)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
	    Employee emp=new Employee(); 
	    emp.setName(name);
	    emp.setDept(dept);
       Transaction tx=session.beginTransaction();
       session.persist(emp);
       tx.commit();
       session.close();
        factory.close();
        
	}
	
	public String getDeptName(int id)
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
        org.hibernate.Query query = session.createQuery("from Dept where id= :id");
        query.setLong("id", id);        
        Dept deptRow = (Dept) query.uniqueResult();
        session.close();
        factory.close();
       return deptRow.name;
	}
	
	public void showEmployee()
	{
		System.out.println("inside isDeptPresent");
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    org.hibernate.Session session = factory.openSession();
        org.hibernate.Query query = session.createQuery("FROM Employee");
      //  Transaction tx=session.beginTransaction();
        java.util.List<Employee> list=query.list();
      //  tx.commit();
        session.close();
        factory.close();
        System.out.println("Employee Name \t Department Name");
        for(Employee emp: list)
        {
        	System.out.println(" "+emp.getName()+"\t"+emp.getDept().getName());
        }
        
		
	}
}

