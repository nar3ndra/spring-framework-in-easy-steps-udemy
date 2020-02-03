package com.narendra.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	private Profile profile;
	
	@Value("Narendra")
	private String name;
	
	public void details() {
		System.out.println("My name is "+this.name+" and I am "+this.profile.getSkill1()+" and "+this.profile.getSkill2());
	}
	
}
