package com.collectionFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collectionFramework/CollectionConfig.xml");
		Student student1 = (Student)context.getBean("student1");
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getAddress());
		System.out.println(student1.getPhoneNo());
		System.out.println(student1.getCourses());
	}
}
