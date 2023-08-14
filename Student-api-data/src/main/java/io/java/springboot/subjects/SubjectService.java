package io.java.springboot.subjects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubjects(String studentRollNo){
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findByStudentRollNo(studentRollNo)
		.forEach(subjects::add);
		
		return subjects;
	}

	public Object getSubject(String rollNo) {
		return subjectRepository.findById(rollNo);
	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public void updateSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public void deleteSubject(String id) {
		subjectRepository.deleteById(id);
	}
}
