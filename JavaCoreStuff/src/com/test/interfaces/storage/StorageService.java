package com.test.interfaces.storage;

public class StorageService {
	
	
	
	public void putData(String data) {
		
//		Storage storage = new MySQLStorage();
		Storage storage = new MSAccessStorage();
		storage.putData();
		
		
	}
	

}
