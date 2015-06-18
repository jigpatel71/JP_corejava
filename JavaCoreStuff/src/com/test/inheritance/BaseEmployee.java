package com.test.inheritance;

public class BaseEmployee {
	
	String name;
	String deptName;
	int empId;
	
	public void reportToWork() {
		System.out.println("Employee reporting to work");
	}
	
	public void takeBenefits() {
		System.out.println("Employee Take employee benefits");
	}
	
	public void takeSalaryAtEOM() {
		System.out.println("Employee Take salary at EOM");
	}

}
