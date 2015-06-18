package com.test.comparator;

import java.util.Comparator;

 public class CountrySortingByIdComparator implements Comparator<Country>{

    @Override
    public int compare(Country country1, Country country2) {

//    	System.out.println("country1 id: " + country1.getCountryId() + "country2 id: "+ country2.getCountryId());
        return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
//        int result =  (country1.getCountryId() > country2.getCountryId() ) ? -1: 1 ;
//    	System.out.println("result" + result);
//        return result;

    }

}