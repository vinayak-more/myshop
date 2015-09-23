package main.java.bean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class SessionBean {
	
	public static int sessionCount=0;
	public SessionBean() {
		sessionCount++;
		System.out.println(sessionCount);
	}

	public static HttpSession getSession() {
		System.out.println(sessionCount);
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}

	public static void invalidate(HttpSession session) {
		try{
			session.invalidate();
			sessionCount--;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
