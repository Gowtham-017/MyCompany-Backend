package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpDetails")
public class EmpDetails {
	@Id
	private int empid;
	private String name;
	private int salary;
	private String role;
	private int experience;
	private long phone;
	private String email;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public EmpDetails(int empid, String name, int salary, String role, int experience, long phone, String email) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.experience = experience;
		this.phone = phone;
		this.email = email;
	}
	public EmpDetails() {
		
	}
	public String toString() {
		return "empid="+empid+"name="+name+"salary="+salary+"role="+role+"experience="+experience+"phone="+phone+"email="+email;
	}
	

}
