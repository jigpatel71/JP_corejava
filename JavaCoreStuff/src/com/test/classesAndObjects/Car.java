package com.test.classesAndObjects;

public class Car {

	
	// instance variables
	String modelName;
	String transmission;
	int doors;
	int cylinders;
	
//	public Car(String modelName, String transmission, int doors, int cylinders) {
//		
//	}
	
	// behaviour of the class
	public void build(String model, String transmissionType, int noOfDoors, int noOfCylinders) {
		modelName = model;
		transmission = transmissionType;
		doors = noOfDoors;
		cylinders = noOfCylinders;
	}
	
	public void displayInformation() {
		String info = "Name: "+ modelName + " transmission:" + transmission + " doors:" + doors + " cylinders:" + cylinders;
		System.out.println("Here is the information for my car:" + info);
	}
	
	
}
