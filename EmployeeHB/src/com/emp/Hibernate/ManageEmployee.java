package com.emp.Hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {

	
	public static void main(String args[])
	{
		UtilityMethods utility=new UtilityMethods();
		utility.showEmployee();
		System.out.println("Enter name and department in cap:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			/*Configuration cfg = new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    SessionFactory factory = cfg.buildSessionFactory();
		    org.hibernate.Session session = factory.openSession();*/
			//todo logic----
			String name=br.readLine();
			String dept=br.readLine();
		//	utility.showEmployee();
			if(utility.isDeptPresent(dept))
			{
				int dept_id=utility.getDeptId(dept);
				System.out.println("Working.. Dept "+dept+" is present with id="+dept_id);
				Dept d=utility.getDept(dept);
				utility.addEmployee(name, d);
				System.out.println("Employee "+name+" is added successfully");
				//utility.showEmployee();
			}
			else
			{
				System.out.println(" dept "+dept+" is not present adding");// new dept with id:"+utility.addDept(dept));
				utility.addDept(dept);
				Dept d=utility.getDept(dept);
				utility.addEmployee(name, d);
			
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
