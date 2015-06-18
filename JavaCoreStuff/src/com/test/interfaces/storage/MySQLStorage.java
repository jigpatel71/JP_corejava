package com.test.interfaces.storage;

public class MySQLStorage implements Storage {

	@Override
	public void putData() {
		System.out.println("Put data in mysql server database");
	}

	
	
}
