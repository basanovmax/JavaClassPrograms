package com.java.Practice;

import java.sql.*;

public class JDBCPractice {

	private static final String url = "jdbc:mysql://localhost:3306/products";
	private static final String userName = "root";
	private static final String password = "Max671317";
	public static void main(String[] args) throws Exception {
		// 1.Connect

		Class.forName("com.mysql.cj.jdbc.Driver");


		Connection con = DriverManager.getConnection(url, userName, password);
		Statement statement = con.createStatement();
		//statement.execute("INSERT INTO customers(name, age) VALUES ('myName', 1111)");
		//int result = statement.executeUpdate("UPDATE customers SET name = 'newMax' WHERE name = 'Maxim';");
		//System.out.println(result);
		ResultSet res = statement.executeQuery("SELECT * FROM customers");





		System.out.println(con.isClosed());

		con.close();
	}
}
