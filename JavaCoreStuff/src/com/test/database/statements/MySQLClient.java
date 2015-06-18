package com.test.database.statements;

import java.sql.SQLException;

public class MySQLClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		insertIntoDatabase();
		readFromDatabase();
		
	}

	private static void insertIntoDatabase() throws ClassNotFoundException {
		InsertUsingStatements insertObj = new InsertUsingStatements();
		insertObj.insertIntoDatabase();
	}

	private static void readFromDatabase() throws ClassNotFoundException,
			SQLException {
		ReadUsingStatements readObj = new ReadUsingStatements();
		readObj.readDataFromDatabase();
	}

}
