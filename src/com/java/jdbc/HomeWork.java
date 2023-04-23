package com.java.jdbc;

import java.sql.*;

public class HomeWork {
	public static void main(String[] args) throws Exception {
/*		=========Homework 18 April ===========
		Using JDBC, Execute the following queries and print data into the console of IntelliJ
		Fetch all employees sorted by youngest to oldest
		Fetch all unique countries from employees table
		Fetch all records of QA Engineers*/
		String url = "jdbc:mysql://localhost:3306/mycompany";
		String userName = "root";
		String password = "Max671317";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);

		Statement stmt = con.createStatement();

		System.out.println("1. Fetch all employees sorted by youngest to oldest");
		ResultSet rs1 = stmt.executeQuery("select first_name,birth_date from employees ORDER BY birth_date");

		while (rs1.next()) {
			System.out.println(rs1.getString("first_name") + " " + rs1.getString("birth_date"));
		}

		System.out.println("2. Fetch all unique countries from employees table");

		ResultSet rs2 = stmt.executeQuery("select distinct country from employees ");

		while (rs2.next()) {
			System.out.println(rs2.getString("country"));
		}

		System.out.println("3. Fetch all records of QA Engineers");

		ResultSet rs3 = stmt.executeQuery("select first_name, description from employees e inner join roles r ON " +
				"e.designation_id = r.role_id WHERE description = \"QA Engineer\"");

		while (rs3.next()) {
			System.out.println(rs3.getString("first_name") + " " + rs3.getString("description"));
		}
		con.close();
	}
}




