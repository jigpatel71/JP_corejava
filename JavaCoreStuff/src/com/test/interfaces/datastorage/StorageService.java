package com.test.interfaces.datastorage;

public class StorageService {
	
	
	
	public void putData(String data) {
		
//		Storage storage = new MySQLStorage();
		Storage storage = new MSAccessStorage();
		storage.putData();
		
		
	}
	

}
