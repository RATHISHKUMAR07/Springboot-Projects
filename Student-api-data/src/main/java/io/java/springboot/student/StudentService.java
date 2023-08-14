package io.java.springboot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll()
		.forEach(students::add);
		
		return students;
	}

	public Object getStudent(String rollNo) {
		return studentRepository.findById(rollNo);
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(Student student, String rollNo) {
		studentRepository.save(student);
	}

	public void deleteStudent(String rollNo) {
		studentRepository.deleteById(rollNo);
	}
}
