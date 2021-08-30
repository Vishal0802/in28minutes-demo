package com.in28minuets.springboot.in28minutesdemo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Descritption"),
				new Topic("Java","Spring Framework","Descritption"),
				new Topic("AWS","Spring Framework","Descritption")
				
				);
		
		
	}
}
