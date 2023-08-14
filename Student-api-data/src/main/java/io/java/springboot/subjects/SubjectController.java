package io.java.springboot.subjects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.springboot.student.Student;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/students/{rollNo}/subjects")
	public List<Subject> getAllSubjects(@PathVariable String rollNo){
		return subjectService.getAllSubjects(rollNo);
	}
	
	
	@RequestMapping("/students/{studentRollNo}/subjects/{id}")
	public Object getSubject(@PathVariable String id) {
		return subjectService.getSubject(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/students/{studentRollNo}/subjects")
	public void addSubject(@RequestBody Subject subject, @PathVariable String studentRollNo) {
		subject.setStudent(new Student(studentRollNo, "", "", "", ""));
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{studentRollNo}/subjects/{id}")
	public void updateStudent(@RequestBody Subject subject,@PathVariable String studentRollNo, @PathVariable String id) {
		subjectService.updateSubject(subject);
		subject.setStudent(new Student(studentRollNo, "", "", "", ""));
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/students/{studentRollNo}/subjects/{id}")
	public void deleteStudent(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}
	

}
