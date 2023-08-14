package io.java.springboot.subjects;

import io.java.springboot.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Student student;
	
	public Subject(){
	}
	
	public Subject(String id, String name, String description, String studentRollNo) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.setStudent(new Student(studentRollNo, "", "", "",""));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
