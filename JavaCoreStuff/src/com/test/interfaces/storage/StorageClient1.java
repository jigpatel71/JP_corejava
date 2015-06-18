package com.test.interfaces.storage;

public class StorageClient1 {

	public static void main(String[] args) {

		MSAccessStorage storage = new MSAccessStorage();
		storage.putData();
		
		
		StorageService storageService = new StorageService();
		storageService.putData("This is data for storage");
		
		
		
	}

}
