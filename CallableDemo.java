package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.connection.MyConnection;

public class CallableDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = MyConnection.getConnection();
		CallableStatement stat = con.prepareCall("{call firstp(?,?)}");
		stat.setInt(1, 100);
		stat.setString(2, "Hundred");
		stat.execute();
		con.close();

	}

}
