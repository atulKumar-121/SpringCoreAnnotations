package com.learn.spring.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	@Value("Atul Kumar")
	private String name;
	@Value("10")
	private int id;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	 

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + ", topics=" + topics + ", profile=" + profile + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
