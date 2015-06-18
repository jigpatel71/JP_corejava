package com.test.database.statements;

public class Employee {
	
	private String name;
	private String title;
	
	public Employee(String name, String title) {
		this.setName(name);
		this.setTitle(title);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
