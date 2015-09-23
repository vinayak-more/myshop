package main.java.bean;

import javax.faces.bean.ManagedBean;

import main.java.PresentationLayer.LoginPresenter;

@ManagedBean
public class UserBean {
	private String username;
	private String password;
	LoginPresenter login;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validateUser()
	{
		login=new LoginPresenter();
		return login.validateUser(this);
	}
	
	public String logout()
	{
		System.out.println("inside logout");
		//return null;
		return login.logout(this);
		
	}
}
