package com.test.operations;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		shortCircuitOperators();
	}
	
	// && - And operator
	// || - OR operator
	public static void shortCircuitOperators() {
		
		int x = 10;
		int y = 15;
		int z = 20;
		
		// && looks for the first false expression and gets out of the comparison check
		boolean resultAnd = (x > y) && (y < z);
		System.out.println("resultAnd:" + resultAnd);
		
		// || looks for the first true expression and gets out of the comparison check
		boolean resultOR = (x>y) || (y<z) || (y<x);
		System.out.println("resultOR:" + resultOR);
		
	}

}
