package com.test.polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
	}
	
	
	public void sum(int no1, int no2) {
		System.out.println("");
	}
	
	public void sum(int no1) {
		int sum = no1+10;
		System.out.println("");
	}
	
	public void sum(int no1, int no2, int no3) {
		System.out.println("");
	}

	public void sum(float no1, float no2) {
		System.out.println("");
	}

	public void sum(int no1, float no2) {
		System.out.println("");
	}
	
	public void sum(float no1) {
		System.out.println("");
	}
	
}
