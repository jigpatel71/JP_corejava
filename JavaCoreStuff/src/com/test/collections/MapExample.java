package com.test.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		addToHashMap();
	}
	
	public static void addToHashMap() {
		
		HashMap<Integer,String> hashmapObj = new HashMap<Integer,String>();
		
		hashmapObj.put(1, "Sunday");
		hashmapObj.put(2, "Monday");
		hashmapObj.put(3, "Tuesday");
		hashmapObj.put(4, "Wednesday");
		hashmapObj.put(5, "Thursday");
		hashmapObj.put(6, "Friday");
		hashmapObj.put(7, "Saturday");

		//iterating over hashmap keys
		for(Integer key:hashmapObj.keySet()) {
			System.out.println("Key is:" + key);
		}
		
		//iterating over hashmap values
		for(String value:hashmapObj.values()) {
			System.out.println("value is:" + value);
		}
		
		// another way to get the whole mapping
		for(Map.Entry<Integer, String> entry: hashmapObj.entrySet())	{
			
			System.out.println("key is:" + entry.getKey()+ "Value:" + entry.getValue());
		}
		
		//env=test
		//key=value
				
	}

}
