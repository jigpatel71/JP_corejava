package com.test.classesAndObjects;

import com.test.classesAndObjects.Car;

public class ObjectsForCar {
	
	public static void main(String[] args) {
		buildDisplayHondaSportsCar();
		buildDisplayToyotaSedan();
	}
	
	// Create objects for the car
	
	// Create object1 - HondaSportsCar
	public static void buildDisplayHondaSportsCar() {
				
		// This is the way to create object when you use keyword "new". 
		// Car() is called constructor for a class
		Car hondaSportsCar = new Car();
		hondaSportsCar.build("Honda-CRZ", "manual", 2, 8);
		
		hondaSportsCar.displayInformation();
		
	}
	
	// Create object2 - ToyotaSedan
	public static void buildDisplayToyotaSedan() {
		
		// This is the way to create object when you use keyword "new". 
		// Car() is called constructor for a class
		Car toyotaSedan = new Car();
		toyotaSedan.build("Toyota-Corolla", "automatic", 4, 6);
		
		toyotaSedan.displayInformation();
		
	}
	

}
