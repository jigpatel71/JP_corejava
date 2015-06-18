package com.test.comparator;

import java.util.Comparator;

 public class CountrySortingByNameComparator implements Comparator<Country>{

	 public int compare(Country o1, Country o2) {
			int result = o1.getCountryName().compareTo(o2.getCountryName());
			
			if (result != 0) {
				return result;
			} else {
		        return (o1.getCountryId() < o2.getCountryId() ) ? -1: (o1.getCountryId() > o2.getCountryId() ) ? 1:0 ;
 			}
		}

}