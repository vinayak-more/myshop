package com.myshop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.delegate.LoginDelegate;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -1318936372396306297L;
	private String username;
	private String password;
	private LoginDelegate delegate;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//super.doPost(req, resp);
		delegate=new LoginDelegate();
		username=req.getParameter(username);
		password=req.getParameter(password);
		delegate.isValidUser(username, password);
		
		
		
		
	}
	
	
}
