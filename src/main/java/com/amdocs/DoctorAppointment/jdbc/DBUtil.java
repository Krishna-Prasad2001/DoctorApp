package com.amdocs.DoctorAppointment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String URL="jdbc:mysql://127.0.0.1:3306/HospitalDB";
	private static final String USER_NAME="root";
	private static final String PASSWORD="mysql";

	private static Connection connection;	
	
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Seccess");
		} catch (SQLException e) {
			System.err.println("Error : Connection Not Established\n" + e );
		}
		return connection;
	}
	/*
	 * public static void main(String[] args) { System.out.println(getConnection());
	 * }
	 */
}
