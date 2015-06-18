package com.test.abstraction;

public class AbstractClassClient {
	
	public static void main(String[] args) {
		
		ExcelReportGenerator excelGen = new ExcelReportGenerator();
		excelGen.drawHeader();
		excelGen.fillReportContents();
		excelGen.drawFooter();
		
		HTMLReportGenerator htmlgen = new HTMLReportGenerator();
		htmlgen.drawHeader();
		htmlgen.fillReportContents();
		htmlgen.drawFooter();
	
		// You cannot create an object of AbstractClass
//		ReportsAbstractClass absClass = new ReportsAbstractClass();
		
	}
	

}
