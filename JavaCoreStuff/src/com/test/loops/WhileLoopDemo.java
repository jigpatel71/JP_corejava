package com.test.loops;

public class WhileLoopDemo {
	
	public static void main(String args[]) {
		
//		printNameUsingWhile();
		printNameUsingDoWhile();
	}
	
	public static void printNameUsingWhile() {
		
		int counter = 0;
		//Syntax:
		// while (expression is true)
		// execute the code
		
		while(counter < 3) {
			System.out.println("printName(): counter is: " + counter);
			counter++;
		}
	}
	
	public static void printNameUsingDoWhile() {
		
		int counter = 2;
		//Syntax:
		// do
		// something - execute the code
		// while (expression is true)
		do {
			System.out.println("printNameUsingDoWhile(): counter is: "+ counter);
			counter++;
		} while(counter <= 4);
	}

}
