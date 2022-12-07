package com.to.myproduct.pkg.com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class product {
	
	@Id
	private int id;
	private String Name;
	private String Dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
	public product(int id, String name, String dept) {
		super();
		this.id = id;
		this.Name = name;
		this.Dept = dept;
	}
	public product() {
		super();
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", Name=" + Name + ", Dept=" + Dept + "]";
	}
	
	
	
	

}
