package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //Loading the driver class after downloading ojdbc14.jar file and attaching it
		System.out.println("Driver loaded!");
		//Now we have to connect to the database using the following:
		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger"); // URL, username, password
		System.out.println("Connection Established!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter table name:");
		String tableName = sc.next();
		
		//Now we have to create a statement object
		Statement stat = con.createStatement();
		
		ResultSet rset = stat.executeQuery("select * from "+ tableName); //For DQL
		
		ResultSetMetaData rsmd = rset.getMetaData();
		int columnCount = rsmd.getColumnCount();
		System.out.println("The reuslt is:");
		//Use loop to retrieve all the data -
		while(rset.next())
		{
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rset.getString(i) + "  "); //No println cz we want it as a table.
			}
			System.out.println();
		}
		
		con.close(); //Don't forget to close the connection
	}

}
