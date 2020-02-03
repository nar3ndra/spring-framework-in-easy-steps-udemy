package com.narendra.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/narendra/annotations/beans.xml");
		Person p = (Person) context.getBean("person");
		p.details();
	}
}
