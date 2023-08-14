package io.java.springboot.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	
	@RequestMapping("/students/{rollNo}")
	public Object getStudent(@PathVariable String rollNo) {
		return studentService.getStudent(rollNo);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{rollNo}")
	public void updateStudent(@RequestBody Student student,@PathVariable String rollNo) {
		studentService.updateStudent(student, rollNo);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/students/{rollNo}")
	public void deleteStudent(@RequestBody Student student, @PathVariable String rollNo) {
		studentService.deleteStudent(rollNo);
	}
	

}
