package com.test.database.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadUsingPreparedStatement {
	
	private Connection connection = null;
	private PreparedStatement preparedstatement = null;
	private ResultSet resultset = null;
	
	/*JDBC Steps

	1.Load the MySQL driver, each DB has its own driver
	2. Setup the connection with the DB
	3. Statements allow to issue SQL queries to the database
	4. Result set get the result of the SQL query*/
	
	// loading the driver and establishing the connection to the database
	private Connection setupDBConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost/company?"
				+ "user=root&password=password");

//		connection = DriverManager.getConnection("jdbc:mysql://localhost/company");
		
		return connection;
	}
	
	// create statements and read from database
	public void readDataFromDatabase() throws ClassNotFoundException, SQLException {
		
		// got the connection
		connection = setupDBConn();
		
	      preparedstatement = connection.prepareStatement("select * from employee");
		
		// execute the query
		 resultset = preparedstatement.executeQuery();
		 printResults(resultset);
	}

	// create statements and read from database
	public void readDataFromDatabaseUsingBindParameters() throws ClassNotFoundException, SQLException {
		
		// got the connection
		connection = setupDBConn();
		
	      preparedstatement = connection.prepareStatement("select * from employee where id=?;");
	      preparedstatement.setInt(1, 2);
		
		// execute the query
		 resultset = preparedstatement.executeQuery();
		 printResults(resultset);
	}
	
	
	private void printResults(ResultSet resultset) throws SQLException {
		
		while(resultset.next()) {
			String name = resultset.getString("name");
			String title = resultset.getString("title");
			System.out.println("name: "+ name);
			System.out.println("title: "+ title);
		}
	
}
		
		
	}


