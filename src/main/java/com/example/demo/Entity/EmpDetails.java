package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployerDetails")
public class EmpDetails {
	@Id
	@Column(name="empid")
	private int empid;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	@Column(name="role")
	private String role;
	@Column(name="experience")
	private int experience;
	@Column(name="phone")
	private long phone;
	@Column(name="email")
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
