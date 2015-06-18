package com.test.database.preparedstatements;

import java.sql.SQLException;

public class MySQLClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ReadUsingPreparedStatement readObj = new ReadUsingPreparedStatement();
//		readObj.readDataFromDatabase();
		readObj.readDataFromDatabaseUsingBindParameters();
		
//		InsertUsingPreparedStatements insertObj = new InsertUsingPreparedStatements();
//		insertObj.insertIntoDatabase();

		
	}

}
