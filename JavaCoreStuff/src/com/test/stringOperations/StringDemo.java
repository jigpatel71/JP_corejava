package com.test.stringOperations;

public class StringDemo {
	
	
	public static void main(String args[]) {
		
		stringManipulations();
		
	}
	
	public static void stringManipulations() {
		
		String s1 = "Hello";
		String s2 = "World";
		
		String s3 = s1+s2;
		System.out.println("Sum of two strings:" + s3);
		
		String s4 = s1+" "+s2;
		System.out.println("Sum of two strings with space:" + s4);
		
		String s5 = s1.concat(s2);
		System.out.println("Sum of two strings using concat s5:" + s5);
		
		int lengthOfString = s5.length();
		System.out.println("lengthOfString:" + lengthOfString);

		String s5InCaps = s5.toUpperCase();
		System.out.println("s5InCaps:" + s5InCaps);
		
		String s5SubString = s5.substring(4);
		System.out.println("s5SubString:" + s5SubString);

		


	}
	
	
	
	

}
