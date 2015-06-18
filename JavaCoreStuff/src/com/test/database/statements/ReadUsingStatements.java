package com.test.database.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.database.util.DatabaseUtil;

public class ReadUsingStatements {
	
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	private DatabaseUtil databaseUtil = null;
	
	ReadUsingStatements() {
		databaseUtil = new DatabaseUtil();
	}
	
	
	// create statements and read from database
	public void readDataFromDatabase() throws ClassNotFoundException, SQLException {
		
		// got the connection
		connection = databaseUtil.setupDBConn();
		
		// create statement
		statement = connection.createStatement();
		
		// execute the query
		 resultset = statement.executeQuery("select * from company.employee");
		 
		 List<Employee> empList = printResults(resultset);
		 for (Employee emp: empList) {
			 emp.getName();
			 emp.getTitle();
		 }
	}

	private List<Employee> printResults(ResultSet resultset) throws SQLException {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		while(resultset.next()) {
			String name = resultset.getString("name");
			String title = resultset.getString("title");
			System.out.println("name: "+ name);
			System.out.println("title: "+ title);
			empList.add(new Employee(name,title));
		}
	
		return empList;
}
		
		
	}


