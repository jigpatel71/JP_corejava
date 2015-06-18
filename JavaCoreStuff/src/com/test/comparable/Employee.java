package com.test.comparable;

public class Employee implements Comparable {

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

	// Comparison based on id
	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		return this.getId() - emp.getId();
	}
	
	// Comparison based on name
/*	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		return this.name.compareTo(emp.getName());
	}
*/	
}
