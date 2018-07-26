package com;

import java.sql.Connection;
import java.sql.SQLException;

import com.connection.MyConnection;

public class BatchTest {

	public static void main(String[] args) throws SQLException {
		Connection con = MyConnection.getConnection();
		
		con.setAutoCommit(false);
		java.sql.Statement stat = con.createStatement();
		
		stat.addBatch("Insert into student values('1','Sirji')");
		stat.addBatch("Insert into student values('2','Theek')");
		stat.addBatch("Insert into student values('3','Lolwa')");
		stat.addBatch("Insert into student values('4','Hatt')");
		
		int[] updateCounts = stat.executeBatch();
		con.commit();
		con.close();

	}

}
