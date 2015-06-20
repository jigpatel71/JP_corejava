package com.test.constructors;
// ** Testing for Jenkins**
public class Car {

	
	// instance variables
	String modelName;
	String transmission;
	int doors;
	int cylinders;
	
	//default 
	public Car() {
		System.out.println("Default Parent constructor");
	}
	
	//overloaded 
	public Car(String modelName) {
		System.out.println("Overloaded Parent constructor");
	}
	
	// overloaded constructor
	public Car(String m, String t, int d, int c) {
		modelName = m;
		transmission = t;
		doors = d;
			validateDoors(d);
		
		cylinders = c;
	}
	
		
	private void validateDoors(int d) {
		if(d < 1) {
			throw new IllegalArgumentException("Value for doors cannot be less than 1");
		}
	}

	public void displayInformation() {
		String info = "Name: "+ modelName + " transmission:" + transmission + " doors:" + doors + " cylinders:" + cylinders;
		System.out.println("Here is the information for my car:" + info);
	}
	
	
}
