package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Allows all the operations to the class like Post, Get and Put etc.
@RestController
public class TopicController {
	
	//Marks something that needs dependency injection
	@Autowired
	private TopicService topicService;
	
	//This means if the path comes as /topics then it will call the below method to create a topic object
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	
	//{id} - It tells as variable portion
	//@PathVarible tells as in the path which comes in the {id} - this takes as variable
	//If the path id name and variable id are different means we can tell as (@PathVariable("fire") String id) path -> ("/topics/{fire}")
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//For posting topic in "/topics" path 
	//@requestMapping tells that your request pay load contains JSON representation of the "Topic" instance 
	//@RequestBody convert into Topic instance and pass it to addTopic
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}
