package com.test.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedExceptionFileExample {  
   public static void main(String args[]) {
		fileReader();
   }

private static void fileReader() {
	FileInputStream fis = null;
	try {
	    fis = new FileInputStream("/opt/inputfiles/batch-upgrade-request.csv"); 
	} catch(FileNotFoundException fnfe) {
	        System.out.println("The specified file is not " +
			"present at the given path");
	}
	int k; 
	try {
	    while(( k = fis.read() ) != -1) { 
		System.out.print((char)k); 
	} 
	 fis.close(); 
	} catch(IOException ioe){
	    System.out.println("I/O error occurred: "+ioe);
	}
}
}
