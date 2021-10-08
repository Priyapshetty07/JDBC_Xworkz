package com.MysqlAndJavaConnection;

//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class Laptop {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
		}
		catch (SQLException sqlException) {


		} 
		catch (ClassNotFoundException classNotFoundException) {

			classNotFoundException.printStackTrace();
		}

	}

}
