package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
//		addToArrayList();
//		addAtSpecificLocation();
//		removeFromArrayList();
		iteratorExample();
	}
	
	
	static void addToArrayList() {
		
		ArrayList<String> alObj1 = new ArrayList<String>();
		
		//adding to the arraylist
		alObj1.add("Apple");
		alObj1.add("Orange");
		alObj1.add("Peach");
		alObj1.add("Apple");
		alObj1.add("Orange");
		alObj1.add("Pear");
		
		System.out.println("obj1:" + alObj1);
	}


	private static void addAtSpecificLocation() {

		//adding to the arraylist at a particular location
		ArrayList<String> alObj2 = new ArrayList<String>();
		
		//adding to the arraylist
		alObj2.add(0,"Apple");
		alObj2.add(1,"Orange");
		alObj2.add(2,"Peach");
		alObj2.add(3,"Apple");
		alObj2.add(4,"Orange");
		alObj2.add(5,"Pear");
		
		System.out.println("obj2:" + alObj2);
	}

	private static void removeFromArrayList() {
		
		//adding to the arraylist at a particular location
		ArrayList<String> alObj2 = new ArrayList<String>();
		
		//adding to the arraylist
		alObj2.add(0,"Apple");
		alObj2.add(1,"Orange");
		alObj2.add(2,"Peach");

		alObj2.remove(0);
		
		System.out.println("obj2:" + alObj2);

		
	}
	
	private static void retrieveFromArrayList() {
		
		//adding to the arraylist at a particular location
		ArrayList<String> alObj2 = new ArrayList<String>();
		
		//adding to the arraylist
		alObj2.add(0,"Apple");
		alObj2.add(1,"Orange");
		alObj2.add(2,"Peach");

		String fruit = alObj2.get(1);
		System.out.println("value at index 1:" + alObj2.get(1));
	}
	
	private static void iteratorExample() {
		
		//adding to the arraylist at a particular location
		ArrayList<String> alObj2 = new ArrayList<String>();
		
		//adding to the arraylist
		alObj2.add(0,"Apple");
		alObj2.add(1,"Orange");
		alObj2.add(2,"Peach");

		String fruit = alObj2.get(1);
//		System.out.println("value at index 1:" + alObj2.get(1));
		
		//using iterator to retrieve values from arraylist
		Iterator<String> itr = alObj2.iterator();
		while(itr.hasNext()) {
			String obj = itr.next();
			System.out.println("Value in the collection:" + obj);
			itr.remove();		// You can modify the collection in the loop
	
		}

		System.out.println("Value in the collection:" + alObj2);

		//enhanced for loop: for-each loop
		//You can't modify the collection in the loop
		for(String counter : alObj2) {
			System.out.println("value:" + counter);
			alObj2.remove(counter);
		}
		
		
				
	}
}
