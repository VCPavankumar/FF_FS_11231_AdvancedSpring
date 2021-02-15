package com.hcl.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)		

	private int id;
	private String name;
	private String emailid;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}



}



