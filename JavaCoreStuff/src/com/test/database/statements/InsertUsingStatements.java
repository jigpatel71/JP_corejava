package com.test.database.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.test.database.util.DatabaseUtil;

public class InsertUsingStatements {
	
	
	private Connection connection = null;
	private Statement stmt = null;
	private ResultSet resultset = null;
	private DatabaseUtil databaseutil = null;
	
	
	InsertUsingStatements() {
		databaseutil = new DatabaseUtil();
	}
	

	// insert statement with parameters
	public void insertIntoDatabase(String empname,String title, int deptId) throws ClassNotFoundException {
		try {
			connection  = databaseutil.setupDBConn();
            stmt = connection.createStatement();

            for (int i=4; i<=8; i++) {
            	//String sql = "INSERT INTO Employee VALUES ("+i +", 'EmpNo'"+i+", 'Emp', 1, 1)";
            	String sql = "INSERT INTO Employee VALUES ("+i+", '"+empname+"', '"+title+"', 2,"+ deptId+")";
            	System.out.println("sql is:" + sql);
            	stmt.executeUpdate(sql);
            }

        } catch (SQLException ex) {
        	ex.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {
            	ex.printStackTrace();
            }
        }
    }
	
	public void insertIntoDatabase() throws ClassNotFoundException {
		try {
			connection  = databaseutil.setupDBConn();
            stmt = connection.createStatement();
            
        	String sql = "INSERT INTO Employee VALUES (15, 'EmpName15', 'Emp', 15, 2)";
        	int count = stmt.executeUpdate(sql);
        	System.out.println("No of rows inserted: "+ count);


        } catch (SQLException ex) {
        	ex.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
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
