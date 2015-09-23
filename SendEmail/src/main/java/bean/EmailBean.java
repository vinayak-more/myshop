package main.java.bean;

public class EmailBean {

	private String from;
	private String to;
	private String subject;
	private String mailBody;
	private boolean isPlainText;
	private boolean isHTMLText;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMailBody() {
		return mailBody;
	}

	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	public boolean isPlainText() {
		return isPlainText;
	}

	public void setPlainText(boolean isPlainText) {
		this.isPlainText = isPlainText;
	}

	public boolean isHTMLText() {
		return isHTMLText;
	}

	public void setHTMLText(boolean isHTMLText) {
		this.isHTMLText = isHTMLText;
	}

	@Override
	public String toString() {
		return "EmailBean [from=" + from + ", to=" + to + ", subject="
				+ subject + ", mailBody=" + mailBody + "]";
	}

}
