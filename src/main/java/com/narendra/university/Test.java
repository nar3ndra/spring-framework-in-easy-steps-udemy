package com.narendra.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/narendra/university/beans.xml");
		University t = (University) context.getBean("uni");
		System.out.println(t.getId()+"   "+t.getName()+"   "+t.getLocation());
		
	}
}
