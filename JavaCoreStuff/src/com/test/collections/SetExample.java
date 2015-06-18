package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		//addToHashSet();
		deleteFromHastSet();
		//iterateIverHashSet();
	//	convertSetToHashSet();
	}

	
	static void addToHashSet() {
		
		HashSet<String> hashObj = new HashSet<String>();
		
		//adding to the hashset
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Peach");
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Pear");
		
		System.out.println("hashObj:" + hashObj);
	}
	
	public static void deleteFromHastSet() {
		
		HashSet<String> hashObj = new HashSet<String>();
		
		//adding to the hashset
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Peach");
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Pear");
		
		hashObj.clear();
		System.out.println("hashObj:" + hashObj);
	}
	
	static void iterateIverHashSet() {
		
		HashSet<String> hashObj = new HashSet<String>();
		
		//adding to the hashset
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Peach");
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Pear");
		
		Iterator<String> itr = hashObj.iterator();
		while(itr.hasNext()) {
			String obj = itr.next();
			System.out.println("Value in the collection:" + obj);
		}	
	}
	
	public static void convertSetToHashSet() {
		HashSet<String> hashObj = new HashSet<String>();
		
		//adding to the hashset
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Peach");
		hashObj.add("Apple");
		hashObj.add("Orange");
		hashObj.add("Pear");
		
		System.out.println("hashSet:" + hashObj);
		
		ArrayList<String> arrObj = new ArrayList<String>(hashObj);
		System.out.println("arrObj:" + arrObj);
		
	}
}
