package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//1 generic type entity type - Topic 
//2 generic type what's the id this entity class have - String
public interface TopicRepository extends CrudRepository<Topic, String> {

	
	
}
