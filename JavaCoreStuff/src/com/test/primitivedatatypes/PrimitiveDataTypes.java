package com.test.primitivedatatypes;

public class PrimitiveDataTypes {
	
	public static void main(String[] values) {
		
		relationalOperators();
	}
	
	
	public static void differentPrimitiveDataTypes() {
		
		// datatypes - int, double, char, boolean
		
		// defining int value
		int number1 = 10; 
		// other int datatypes
		// byte, short & long
		
		// defining decimal value - float or double
		double price = 10.15;
		
		// character data
		char value = 'a';
		
		//boolean - represent true or false
		boolean isTrue = true;
		boolean isFalse = false;
	}

	// Relational operators
	public static void relationalOperators() {
		
	//	== equal to
	// != not equal to
	// > greater than
	// < less than
	// >= greater than or equal to
	// <= less than or equal to
				
	int value1 = 10;
	int value2 = 20;
	
//	boolean value3 = false;
	
	if (value1 == value2) {
		System.out.println("value1==value2");
	}
	if (value1 != value2) {
		System.out.println(value1!=value2);
		System.out.println("value1 != value2");
	}
	if (value1 > value2) {
		System.out.println("value1 > value2");
	}
	if (value1 <= value2) {
		System.out.println("value1 <= value2");
	}	
	if (value1 >= value2) {
		System.out.println("value1 >= value2");
	}
	if(true) {
		System.out.println("value3");
	}
	
	
	}
	
}
