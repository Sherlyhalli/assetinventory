package com.itaim.application.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable 
{
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone" , nullable = false)
	private long phone;
	
	@Column(name = "address" , nullable = false)
	private String address;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int id, String name, String email, long phone, String address, String client)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone)
	{
		this.phone = phone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}


	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}	    

}
