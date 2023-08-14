package io.java.springboot.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String>{
	
}
