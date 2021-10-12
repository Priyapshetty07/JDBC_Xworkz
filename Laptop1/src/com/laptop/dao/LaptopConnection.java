package com.laptop.dao;

import java.sql.*;

public class LaptopConnection {
private static Connection connection = null;
	
	static {
		try {
	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Laptop", "root", "priyadiya0713shetty");
        System.out.println("connection is successful ");
        
	     } catch (SQLException e) {
		   e.printStackTrace();
	     }
	}
	
	public static Connection getconnection() {
		System.out.println("invoked get connection");
		if(connection != null) {
			return connection;
		}
		else {
		System.out.println("connection is not created");
		return connection;
		}
	}
	
	public static void closeConnection() {
		System.out.println("invoked closeConnection()");
		try {
			if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				
			}
		}
}