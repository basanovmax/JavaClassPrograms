package com.java.jdbc;

import java.sql.*;

public class JDBCExample {
	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/mycompany";
		String userName = "root";
		String password = "Max671317";
		// 1.Connect
		Class.forName("com.mysql.cj.jdbc.Driver");  // Register the JDBC driver
		Connection con = DriverManager.getConnection(url, userName, password); // Create connection with database

		// 2.Query
		// Statement interface has method to execute query, so we create object of statement
		Statement stmt = con.createStatement();
		ResultSet rs =  stmt.executeQuery("select * from employees;");

		//3. Print Result
		//Iterate through the result set and print the data
		//rs will point to before first row in the database
		//When we use rs.next(), it will move cursor to next row and return true -
		//if we have data on next row, otherwise it will return else
		ResultSetMetaData rsmd = rs.getMetaData();
		rsmd.getColumnName(1); // select first_name as name from employees --> first name
		int columnIndex = 1; // name

		while (rs.next()) {
			System.out.println(rsmd.getColumnLabel(columnIndex));
			columnIndex++;

			/*for(int i = 1; i <= rsmd.getColumnCount();i++){
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();*/
			/*System.out.println(rs.getString("first_name"));
			System.out.println(rs.getString(2));*/
		}
		// 4. Close
		con.close();
		System.out.println(con.isClosed());
	}
}
