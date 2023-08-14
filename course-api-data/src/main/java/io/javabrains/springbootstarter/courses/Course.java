package io.javabrains.springbootstarter.courses;

import io.javabrains.springbootstarter.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//Marks this as Entity class to identify by Spring JPA
@Entity
public class Course {

	//Marks the below as primary key id
	@Id
	private String id;
	private String name;
	private String description;
	//Many courses to one topic
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
	}
	
	public Course(String id,String name,String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		//"" - empty string as name and description
		this.setTopic(new Topic(topicId,"", ""));
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
	
}
