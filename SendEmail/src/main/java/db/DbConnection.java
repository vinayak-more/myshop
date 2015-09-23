package main.java.db;

import java.sql.*;

public class DbConnection {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";
	   static final String DB_NAME="form";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "infi@123";
	   
	   public static Connection getDbConnection() {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL+DB_NAME,USER,PASS);
	      System.out.println("Database Connected");
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return conn;
	   }

}
