package com.test.finalexamples;

public class Dog extends Animal{

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		dogObj.makeSound();
		dogObj.run();
		dogObj.sleep();  // from parent class
	}
	
	public void run() {
		System.out.println("Dog runs");
	}
	
	// you cannot override a final method from the parent class
/*	@Override
	public void makeSound() {
		System.out.println("Dog make sound - barks");
	}*/
	

}
