package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountrySortingUsingComparable {

	public static void main(String[] args) {
		comparable();
	}
	
	
	public static void comparable() {

    	 Country indiaCountry=new Country(1, "India");
		 Country chinaCountry=new Country(4, "China");
		 Country nepalCountry=new Country(3, "Nepal");
		 Country bhutanCountry=new Country(2, "Bhutan");

        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);

        System.out.println("Before Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
			Country country=(Country) listOfCountries.get(i);
			System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
		}
        Collections.sort(listOfCountries);

        System.out.println("After Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
			Country country=(Country) listOfCountries.get(i);
			System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
	}
	}

	private static void ternaryOperatorsExample() {
		// int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
		// so if you have multiple conditions, you have this:
		// cond1? ifTrue1 : cond2? if True2 : ifFalse2;

		int x = 5;
		int y = 6;
		int z = 2;
		
		int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
		System.out.println("value: "+ min);
		
		int min2 =  (x > y ) ? -1: (x > y ) ? 1:0 ;
		System.out.println("value2: "+ min2);
	}

}
