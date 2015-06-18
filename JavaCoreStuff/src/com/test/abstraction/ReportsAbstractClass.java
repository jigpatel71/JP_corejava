package com.test.abstraction;

public abstract class ReportsAbstractClass {

	//specifications
	
	public void drawHeader() {
		System.out.println("Generating Generic Header");		
	}
	
	
	public void drawFooter() {
		System.out.println("Generating Generic Footer");		
	}
	
	public void putLogo() {
		// Header should be of this length and height
	}
	
	//implemented by each of the subclass
	public abstract void fillReportContents(); 
	
	
}
