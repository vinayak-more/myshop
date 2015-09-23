package main.java.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.bean.EmailBean;


public class DbUtils {
	static Connection conn;

	public static boolean addNewEmail(EmailBean emailBean)
			throws ClassNotFoundException, SQLException, IOException {
		conn = DbConnection.getDbConnection();
		// ethe pali insert query asnar
		Statement st = (Statement) conn.createStatement();
		// aata me karate
		// kk
		// mala sang hey int strin hey konate datatype aahe db che ka
		// konta??
		// normal java cha
		String textType="";
		if(emailBean.isPlainText()) textType="PLAIN_TEXT";
		if(emailBean.isHTMLText()) textType="HTML_TEXT";
		
		String query="insert into email (email_from,email_to,email_subject,email_body,email_text_type,email_time) values(\"" + emailBean.getFrom() + "\",\""
				+ emailBean.getTo() + "\",\"" + emailBean.getSubject() + "\",\"" + emailBean.getMailBody() + "\",\"" + textType
				+ "\",CURRENT_TIMESTAMP)";
		System.out.println(query);
		int i = st.executeUpdate(query);
		
		System.out.println("updated " + i);

		return true;
	}

	public static boolean validateLogin(String username, String password) throws ClassNotFoundException, SQLException, IOException{//accepts username and passwmomrd and return true if user is valid
		conn = DbConnection.getDbConnection();
		// ethe pali insert query asnar
		Statement st = (Statement) conn.createStatement();
		ResultSet rs=st.executeQuery("select * from user where User_id=='"+username+"' and password='"+password+"'");
		if(rs.next())
			return true;
		else
		return false;
		
		
		
	}
}
