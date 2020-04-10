package main.mymain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FlatApplication {

	

	public static void main(String[] args)  {
		h2Demo();
	}

	public static void h2Demo() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName ("org.h2.Driver"); 
			conn = DriverManager.getConnection ("jdbc:h2:~/test", "sa","");
			stmt = conn.createStatement();
			String sql = "DROP SCHEMA IF EXISTS mydb";
			stmt.executeUpdate(sql);
			sql = "CREATE SCHEMA mydb";
			stmt.execute(sql);
			System.out.println("Database created successful.");
			sql = "CREATE TABLE IS NOT EXISTS 'mydb'.'resident' ('id' INT NOT NULL AUTO_INCREMENT,"
					+ "'name' VHARCHAR(100) NOT NULL,"
					+ "'start_balance' INT(7) NOT NULL";
			stmt.execute(sql);
			System.out.println("Table created successful.");
			
		}catch (SQLException e) {
			System.out.println("SQL exception.");
		}catch (ClassNotFoundException c) {
			System.out.println("Class not found.");
		}
	
		
		
	}

}
