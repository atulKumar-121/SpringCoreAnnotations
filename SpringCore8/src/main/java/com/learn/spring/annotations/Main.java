package com.learn.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/annotations/config.xml");
		Instructor instructor1 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor1.toString());
		Instructor instructor2 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor1.hashCode());
		System.out.println(instructor2.hashCode());
	}

}
