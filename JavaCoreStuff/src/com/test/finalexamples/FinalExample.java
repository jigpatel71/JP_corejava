package com.test.finalexamples;

public class FinalExample {

	final int COUNTER;
	int sum;
	
	public FinalExample() {
		COUNTER= 15;
	}

	//final keyword - can be applied to Class, method, variable
	
	//final variable - defining a constant. Value cannot be changed once initialized
	//final int counter = 10;
	
	//final method - cannot be overridden in a subclass.
	//final public void addition()
	
	//final class - You cannot subclass (cannot extend it)
	//final public class MathOperations 
	
	void modifyValues() {
		sum = 30;
	//	COUNTER = 50;  --> You cannot reassign a value to final variable
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		
	}

}
