package com.emp.Hibernate;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id @GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Dept dept;
	
	//---
	public void setId(int paraId)
	{
		id=paraId;
	}
	public int getId()
	{
		return id;
	}
	///----
	
	public void setName(String paraName)
	{
		name=paraName;
	}
	public String getName()
	{
		return name;
	}
	///----
	public void setDept(Dept paraDeptId)
	{
		dept=paraDeptId;
	}
	public Dept getDept()
	{
		return dept;
	}

}
