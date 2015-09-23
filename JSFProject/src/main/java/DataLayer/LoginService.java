package main.java.DataLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.bean.UserBean;

public class LoginService {

	static Connection conn;

	public static boolean isUser(UserBean user) {

		String sql = "select * from user where username='" + user.getUsername()
				+ "' and password='" + user.getPassword() + "';";
		try {
			conn = DbConnection.getDbConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				conn.close();
				return true;
			} else {
				conn.close();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
