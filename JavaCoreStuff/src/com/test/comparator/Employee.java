package com.test.comparator;

public class Employee {

	private int id;
	private String name;
	private int yearsOfExp;
	
	public Employee(int id, String name, int yearsOfExp) {
		this.setId(id);
		this.setName(name);
		this.setYearsOfExp(yearsOfExp);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

}
