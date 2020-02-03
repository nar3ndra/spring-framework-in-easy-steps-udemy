package com.narendra.university;

import org.springframework.beans.factory.annotation.Required;

public class University {
	
	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String locataion) {
		this.location = locataion;
	}
	
}
