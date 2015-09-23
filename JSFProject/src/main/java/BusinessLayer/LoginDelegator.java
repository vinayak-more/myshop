package main.java.BusinessLayer;

import javax.servlet.http.HttpSession;

import main.java.DataLayer.LoginService;
import main.java.bean.SessionBean;
import main.java.bean.UserBean;

public class LoginDelegator {
	private HttpSession session;
	public  boolean isValideUser(UserBean user) {
		if (LoginService.isUser(user)) {
			 session = SessionBean.getSession();
			session.setAttribute("username", user.getUsername());
			return true;
		}
		return false;
	}
	
	public void logout(UserBean user){
		System.out.println(session.getAttribute("username"));
		SessionBean.invalidate(session);
	}
}
