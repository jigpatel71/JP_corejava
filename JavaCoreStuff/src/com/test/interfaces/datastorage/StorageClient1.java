package com.test.interfaces.datastorage;

public class StorageClient1 {

	public static void main(String[] args) {

		StorageService storageService = new StorageService();
		storageService.putData("This is data for storage");
		
	}

}
