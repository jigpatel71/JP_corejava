package com.test.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExcepThrows {
	
   public static void main(String args[]) {
		try {
			fileReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

   private static void fileReader() throws IOException {
		FileInputStream fis = null;

		fis = new FileInputStream("/opt/inputfiles/batch-upgrade-request.csv"); 

		int k; 
		while(( k = fis.read() ) != -1) { 
			System.out.print((char)k); 
			fis.close(); 
		}
   }
}
