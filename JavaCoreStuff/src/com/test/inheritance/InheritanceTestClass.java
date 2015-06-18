package com.test.inheritance;

import org.apache.log4j.Logger;

public class InheritanceTestClass {
	
	final static Logger log = Logger.getLogger(InheritanceTestClass.class);

	public static void main(String[] args) {
		
		log.info("Entered  main method");
		ExecutiveAssistant ea = new ExecutiveAssistant();
		ea.reportToWork(); // invoking base class method
		ea.adviseExecutives(); // invoking it's specific method
		
		Manager m = new Manager();
		m.takeBenefits();
		m.conductTeamReviews();
		
		Contractor contractor = new Contractor();
		contractor.takeBenefits();
		log.info("Exiting  main method");

	}
	
}
