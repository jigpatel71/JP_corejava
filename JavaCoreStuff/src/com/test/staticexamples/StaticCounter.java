package com.test.staticexamples;

public class StaticCounter {

	//class variable. This applies to all instances
	static int instanceCounter = 0;
	
	// instance variable
	int counter = 0;    
	
	StaticCounter() {
		instanceCounter++;
		counter++;
	}
	
	public static void main(String[] args) {
		StaticCounter stObj = new StaticCounter();
		System.out.println(instanceCounter);
		System.out.println(stObj.counter);
		
		StaticCounter stObj2 = new StaticCounter();
		System.out.println(instanceCounter);
//		System.out.println(stObj.counter);

		temp2();
		
		StaticCounter obj = new StaticCounter();
		obj.temp1();

	}
	
	public void temp1() {
		temp2();
	}
	
	public static void temp2() {
		StaticCounter obj = new StaticCounter();
		obj.temp1();
		
	}
	
}
