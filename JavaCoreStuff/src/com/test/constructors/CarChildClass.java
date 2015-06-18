package com.test.constructors;

//Inheritance example - Java OOP (Object oriented principle)
public class CarChildClass extends Car { 
	
	public CarChildClass() {
		super("Honda");
		System.out.println("This is child default constructor");
	}
	
	public CarChildClass(int no) {
		super("Honda");
		System.out.println("This is child overloaded constructor");
	}

	public CarChildClass(String name) {
//		this();  // this is calling current class no-arg constructor
		this(5); // this is calling current class int-arg constructor
		System.out.println("This is child overloaded constructor with String");
	}
	
	public static void main(String[] args) {
//		CarChildClass child = new CarChildClass();  //--> calling default constructor
//		CarChildClass child = new CarChildClass(5); // --> calling overloaded constructor
		CarChildClass child = new CarChildClass("Name");  //--> calling this class constructor
	}
	

}
