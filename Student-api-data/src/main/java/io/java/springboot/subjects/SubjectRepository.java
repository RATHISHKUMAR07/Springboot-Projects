package io.java.springboot.subjects;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String>{
	public List<Subject> findByStudentRollNo(String studentRollNo);
}
