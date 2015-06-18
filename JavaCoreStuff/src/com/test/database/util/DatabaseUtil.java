package com.test.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*JDBC Steps

1.Load the MySQL driver, each DB has its own driver
2. Setup the connection with the DB
3. Statements allow to issue SQL queries to the database
4. Result set get the result of the SQL query*/

public class DatabaseUtil {
	
	private Connection connection = null;
	
	// loading the driver and establishing the connection to the database
	public Connection setupDBConn() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/company?"
				+ "user=root&password=password");

		return connection;
	}

}
