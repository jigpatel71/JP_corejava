package com.test.database.preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;

public class InsertUsingPreparedStatements {
	
	
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
			
	
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

	public void insertIntoDatabase() throws ClassNotFoundException {
		try {
			  connection  = setupDBConn();
			
		      preparedStatement = connection.prepareStatement("insert into Employee VALUES (?, ?, ?, ?, ?)");

		      preparedStatement.setInt(1, 10);
		      preparedStatement.setString(2, "EmpName");
		      preparedStatement.setString(3, "Dev");
		      preparedStatement.setInt(4, 3);
		      preparedStatement.setInt(5, 2);
		      preparedStatement.executeUpdate();

        } catch (SQLException ex) {
        	ex.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null) {
                	preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {
            	ex.printStackTrace();
            }
        }
    }

}
