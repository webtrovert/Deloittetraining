package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.MyConnection;

public class InsertTest1 {

	public static void main(String[] args) throws SQLException {
		Connection con = MyConnection.getConnection();
		
		
		Scanner sc;
		
		con.setAutoCommit(false); // Since by default, all queries are committed automatically
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter roll :");
			int roll = sc.nextInt();
			
			System.out.println("Enter name: ");
			String name = sc.next();
			//Transaction management concept
			//First we prepare the whole query instead of creating like we used to do
			PreparedStatement statement = con.prepareStatement("insert into student values(?,?)");
			
			//Now we pass the values in the following way
			statement.setInt(1, roll);
			statement.setString(2, name);
			
			sc = new Scanner(System.in);
			System.out.println("Enter roll :");
			int roll1 = sc.nextInt();
			
			System.out.println("Enter name: ");
			String name1 = sc.next();
			
			//First we prepare the whole query instead of creating like we used to do
			PreparedStatement statement1 = con.prepareStatement("insert into student values(?,?)");
			
			//Now we pass the values in the following way
			statement1.setInt(1, roll1);
			statement1.setString(2, name1);
			
			statement.executeUpdate();
			statement1.executeUpdate();
		} catch (Exception e) {
			con.rollback(); // This undos the queries if one of the query is not executed properly
			e.printStackTrace();
		}
		System.out.println("Details added if exceptions not found!");
		con.close();
		

	}

}
