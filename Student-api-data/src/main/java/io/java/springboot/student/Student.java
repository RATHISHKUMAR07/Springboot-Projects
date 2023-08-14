package io.java.springboot.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String rollNo;
	private String name;
	private String college;
	private String department;
	private String gpa;
	
	Student(){
	}
	
	public Student(String rollNo,String name,String college,String department,String gpa){
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.college = college;
		this.department = department;
		this.gpa = gpa;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	

}
