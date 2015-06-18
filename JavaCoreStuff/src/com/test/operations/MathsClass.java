package com.test.operations;

public class MathsClass {
	
	
	public static void main(String args[]) {
		
		sumOfTwoNumbers(5, 10);
		int subtractionResult = subtractionOfTwoNumbers(10, 5);
		System.out.println("Main method:subtractionResult " + subtractionResult);
		
	}
	
	// addition. This method does not return a value because the return type is void
	public static void sumOfTwoNumbers(int no1, int no2) {
		
		int sum = no1 + no2;
		System.out.println("Sum of two numbers: " + sum);		
	}

	
	// subtraction. This method returns an int type
	public static int subtractionOfTwoNumbers(int no1, int no2) {
		
		int result = no1 - no2;
		System.out.println("Subtraction of two numbers: " + result);
		
		return result;
				
	}

	
	
	
}
