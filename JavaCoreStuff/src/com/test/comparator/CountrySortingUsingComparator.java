package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.Logger;

public class CountrySortingUsingComparator {
	
	final static Logger logger = Logger.getLogger(CountrySortingUsingComparator.class);

	public static void main(String[] args) {
		
		 Country indiaCountry=new Country(1, "India");
		 Country chinaCountry=new Country(4, "China");
		 Country nepalCountry=new Country(3, "Bhutan");
		 Country bhutanCountry=new Country(6, "Bhutan");
		 Country usaCountry=new Country(5, "America");


		 logger.debug("This is test logger");
		 
	        List<Country> listOfCountries = new ArrayList<Country>();
	        listOfCountries.add(indiaCountry);
	        listOfCountries.add(chinaCountry);
	        listOfCountries.add(nepalCountry);
	        listOfCountries.add(bhutanCountry);
	        listOfCountries.add(usaCountry);
	        
	        logger.debug("Size of list:" + listOfCountries.size());
	        try {
	        	List<Country> listOfNewCountries = null;
	        	listOfNewCountries.size();
	        } catch (Exception e) {
	        	logger.error("While printing listOfNewCountries.size()" +  e);
	        }
	        
	        System.out.println("Before Sort by id : ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
			}
	        Collections.sort(listOfCountries,new CountrySortingByIdComparator());

	        System.out.println("After Sort by id: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}

	        //Sort by countryName
	        Collections.sort(listOfCountries,new CountrySortingByNameComparator());

			System.out.println("After Sort by name: ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}
	        
	}

}
