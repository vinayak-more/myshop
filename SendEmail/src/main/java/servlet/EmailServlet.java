package main.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.bean.EmailBean;
import main.java.mail.SendEmail;

@WebServlet
public class EmailServlet extends HttpServlet {

	private static final long serialVersionUID = -589588488409098532L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		EmailBean email=new EmailBean();
		email.setFrom(req.getParameter("from"));
		email.setTo(req.getParameter("to"));
		email.setSubject(req.getParameter("subject"));
		email.setMailBody(req.getParameter("mailBody"));
		email.setPlainText(true);
		if(new SendEmail().sendEmail(email)){
		System.out.println("mail sent");	
		req.getRequestDispatcher("done.html").forward(req, resp);
		}else{
			System.out.println("error");
			
		}
	}
	
	

}
