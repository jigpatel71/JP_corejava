package com.test.inheritance;

import org.apache.log4j.Logger;

public class Contractor extends BaseEmployee {

	final static Logger log = Logger.getLogger(Contractor.class);

	
	public void fillTimeSheets() {
		log.debug("In fillTimeSheets()");
		System.out.println("Contractor filling timesheets");
	}
	
	@Override
	public void takeBenefits() {
		log.debug("In takeBenefits()");
		System.out.println("Contractor - I don't get benefits, but just a perdiem ");
	}
	
}
