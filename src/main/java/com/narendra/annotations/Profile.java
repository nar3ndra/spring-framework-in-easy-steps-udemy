package com.narendra.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("AI Architect")
	private String skill1;
	
	@Value("AI Engineer")
	private String skill2;
	
	public String getSkill1() {
		return skill1;
	}
	public String getSkill2() {
		return skill2;
	}
}
