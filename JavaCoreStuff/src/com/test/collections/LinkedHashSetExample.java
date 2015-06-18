package com.test.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	//LinkedHashSet maintains the order of insertion
	
	public static void main(String[] args) {
		addToLinkedSetHashSet();
	}

	public static void addToLinkedSetHashSet() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Sunday");
		set.add("Sunday");
		set.add("Monday");
		set.add("Tuesday");
		
		System.out.println(set);
		
		
		
	}
	
}
