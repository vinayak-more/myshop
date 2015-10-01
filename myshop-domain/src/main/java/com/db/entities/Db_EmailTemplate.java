package com.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_template")
public class Db_EmailTemplate {
	
	/*
	 * rid	int(11) AI PK
email_type	varchar(100)
from	varchar(100)
subject	varchar(100)
body	varchar(750)

	 */
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	private int rid;
	
	@Column(name="email_type")
	private String emailType;
	
	@Column(name="email_from")
	private String emailFrom;
	
	@Column(name="email_subject")
	private String emailSubject;
	
	@Column(name="email_body_template")
	private String emailBodyTemplate;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBodyTemplate() {
		return emailBodyTemplate;
	}

	public void setEmailBodyTemplate(String emailBodyTemplate) {
		this.emailBodyTemplate = emailBodyTemplate;
	}
	
	
	

}
