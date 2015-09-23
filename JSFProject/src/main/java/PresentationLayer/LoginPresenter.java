package main.java.PresentationLayer;

import main.java.BusinessLayer.LoginDelegator;
import main.java.bean.UserBean;

public class LoginPresenter {
	
	LoginDelegator delegate;

	public String validateUser(UserBean user) {
		delegate=new LoginDelegator();
		if (delegate.isValideUser(user)) {
			return "welcome";
		} else {
			return "login";
		}

	}
	
	public String logout(UserBean user){
		delegate.logout(user);
		return "login";
	}

}
