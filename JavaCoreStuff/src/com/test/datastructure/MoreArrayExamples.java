package com.test.datastructure;

public class MoreArrayExamples {
	
	public static void main(String[] args) {

//		stringArray();
//		intArray();
		addToArray();
	}
	
	public static void stringArray() {
		
		// initializing a string array
		String[] months = {"Jan", "Feb", "Mar", "Apr"};
		
		// read values from the array and print to the console
		for(int counter=0; counter<months.length; counter++) {
			System.out.println("Value in the string array "+ months[counter] + " at counter:" + counter);
		}
	}
	
	public static void intArray() {
		
		int[] listOfNumbers = {10,20,30,40,50};
		
		//read values from the array and print to the console
		for(int counter=0; counter<listOfNumbers.length; counter++) {
			System.out.println("Value in the int array "+ listOfNumbers[counter] + " at counter:" + counter);
		}
	}
	
	public static void addToArray() {
		String[] months = new String[5];
		
		//reading the empty array
		for(int counter=0; counter<months.length; counter++) {
			System.out.println("Value in the empty array "+ months[counter] + " at counter:" + counter);
		}
		
		//add values to the array
		for (int counter=0; counter<months.length; counter++) {
			months[counter] = "Value"+ counter;
		}
		
		System.out.println("Array element at counter 0: "+ months[0]);
		System.out.println("Array element at counter 1: "+ months[1]);
		System.out.println("Array element at counter 2: "+ months[2]);
		System.out.println("Array element at counter 3: "+ months[3]);
		System.out.println("Array element at counter 4: "+ months[4]);

		
		
		
		
		//reading the array
		for(int counter=0; counter<months.length; counter++) {
			System.out.println("Value in the filled array "+ months[counter] + " at counter:" + counter);
		}

	}
	

}
