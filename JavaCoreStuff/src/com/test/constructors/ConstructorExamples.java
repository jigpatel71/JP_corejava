package com.test.constructors;

public class ConstructorExamples {
	
	public static void main(String[] args) {
//		invokeDefaultConsructor();
//		invokeOverloadedConstructor();
		invokeChildDefaultConstructor();
	}
	
	//invoke default constructor by creating an object
	public static void invokeDefaultConsructor() {		
		Car carObj = new Car();		
	}
	
	//invoke overloaded constructor
	public static void invokeOverloadedConstructor() {
		Car carObj2 = new Car("testcar", "automatic", 3, 4);		
		carObj2.displayInformation();
	}
	
	//Create an object of the child
	public static void invokeChildDefaultConstructor() {
		CarChildClass childobj1 = new CarChildClass();
		childobj1.displayInformation();
	}
	

}
