package com.InsertDeleteUpdateCommand;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

public class Laptop1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 


		String insertQuery1 = "INSERT INTO laptop_details value(1,'DELL',35000,'CORE I5',500)";
		String insertQuery2 = "INSERT INTO laptop_details value(2,'HP',50000,'CORE I7',600)";
		String insertQuery3 = "INSERT INTO laptop_details value(3,'LENOVA',45000,'CORE I7',700)";
		String insertQuery4 = "INSERT INTO laptop_details value(4,'HP',95000,'CORE I3',600)";
		String insertQuery5 = "INSERT INTO laptop_details value(5,'ACER',65000,'CORE I5',500)";

		String updateQuery = "UPDATE Laptop.laptop_details SET BRAND='MACBOOK' WHERE ID=4";
		String deleteQuery = "DELETE FROM Laptop.laptop_details WHERE ID=5";

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement(); //to put sql query to java

			statement.executeUpdate(insertQuery1);
			System.out.println("first row is inserted");

			statement.executeUpdate(insertQuery2);
			System.out.println("second row is inserted");

			statement.executeUpdate(insertQuery3);
			System.out.println("third row is inserted");

			statement.executeUpdate(insertQuery4);
			System.out.println("four row is inserted");

			statement.executeUpdate(insertQuery5);
			System.out.println("fifth row is inserted");

			statement.executeUpdate(updateQuery);
			System.out.println("UPDATE 4TH ROW");

			statement.executeUpdate(deleteQuery);
			System.out.println("delete 5th ROW");

		} 
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());

			//sqlException.printStackTrace();
		} 
		catch (Exception classNotFoundException) {

			System.out.println(classNotFoundException.getMessage());

			//classNotFoundException.printStackTrace();	}

		}
	}
}
