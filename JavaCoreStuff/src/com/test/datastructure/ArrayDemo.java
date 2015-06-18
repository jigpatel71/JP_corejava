package com.test.datastructure;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		arrayDemo();
		
	}
	
	
	public static void arrayDemo() {
		
		// array definition
		int[] listOfNumbers  = {1,2,3,4,5,7};
		
		// iterating over the array
		for(int counter=0; counter<listOfNumbers.length; counter++) {
			System.out.println("Value in the array: "+ listOfNumbers[counter]);
		}
		
	}

}
