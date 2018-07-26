package com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class JDBCInsertTest {

	public static void main(String[] args) throws SQLException {
		Connection con = MyConnection.getConnection();
		Statement stat = con.createStatement();
		int rowsAffected = stat.executeUpdate("insert into stu_d values(15,'Hello')");
		
		System.out.println(rowsAffected+ "row(s) inserted succesfully");
		con.close();

	}

}
