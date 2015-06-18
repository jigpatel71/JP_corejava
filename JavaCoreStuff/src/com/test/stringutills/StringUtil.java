package com.test.stringutills;

public class StringUtil {
	
	public static void addStrings() {
		String firstWord = "Hello ";
		String secondWorld = "World";
		int c = 10;
		
		String concatenatedValue = firstWord.concat(secondWorld);
		System.out.println("concatenateStrings: concatenatedValue " + concatenatedValue);
		
	}
	
	private static void substring() {
		String s1 = "HelloWorld";
		
		String substringValue = s1.substring(5);
		System.out.println("substring: substringValue " + substringValue);
		
	}
	
	protected static void stringCaseConverter() {
		String s1 = "helloworld";
		
		String upperCaseValue = s1.toUpperCase();
		System.out.println("stringCaseConverter: upperCaseValue " + upperCaseValue);
	}
	
	static void stringTimmer() {
		String s1 = "helloworld    ";
		
		String trimmedString = s1.trim();
		System.out.println("stringTimmer: trimmedString " + trimmedString);
	}
	
}
