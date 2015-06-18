package com.test.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		addToSortedSet();
	}

	public static  void addToSortedSet() {
		
		SortedSet<String> set = new TreeSet();
		set.add("Sunday");
		set.add("Sunday");
		set.add("Monday");
		set.add("Tuesday");
		
		System.out.println(set);
		
		
	}
	
}
