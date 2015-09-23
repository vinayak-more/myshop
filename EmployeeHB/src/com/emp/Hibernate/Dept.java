package com.emp.Hibernate;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="dept")
public class Dept {
	
	@Id @GeneratedValue
	@Column(name="id") int id;
	
	@Column(name="name") String name;
	
	/*@OneToMany(mappedBy="dept")
	private Set<Employee> dept;
	*/
	//--
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
	


}


