package com.test.interfaces.datastorage;

public class MySQLStorage implements Storage {

	@Override
	public void putData() {
		System.out.println("Put data in mysql server database");
	}

	
	
}
