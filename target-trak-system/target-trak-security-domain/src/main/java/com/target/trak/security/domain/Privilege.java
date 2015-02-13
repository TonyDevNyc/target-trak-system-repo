package com.target.trak.security.domain;

public class Privilege {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Privilege [name=" + name + "]";
	}
	
	
}
