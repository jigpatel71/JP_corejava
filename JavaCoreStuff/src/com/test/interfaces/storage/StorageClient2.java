package com.test.interfaces.storage;

public class StorageClient2 {

	public static void main(String[] args) {

		StorageService storageService = new StorageService();
		storageService.putData("This is data for storage");
		
	}

}
