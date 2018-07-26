package com;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class JDBCCreateTest {

	public static void main(String[] args) throws SQLException {
		Connection con = MyConnection.getConnection();
		Statement stat = con.createStatement();
		
		stat.execute("create table student (roll number, sname varchar2(20))");
		System.out.println("Table created");

	}

}
