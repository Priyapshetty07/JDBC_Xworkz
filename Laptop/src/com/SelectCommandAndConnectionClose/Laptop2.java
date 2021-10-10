package com.SelectCommandAndConnectionClose;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

public class Laptop2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String insertQuery1 = "INSERT INTO laptop_details value(1,'DELL',35000,'CORE I5',500)";
		String insertQuery2 = "INSERT INTO laptop_details value(2,'HP',50000,'CORE I7',600)";
		String insertQuery3 = "INSERT INTO laptop_details value(3,'LENOVA',45000,'CORE I7',700)";
		String insertQuery4 = "INSERT INTO laptop_details value(4,'HP',95000,'CORE I3',600)";
		String insertQuery5 = "INSERT INTO laptop_details value(5,'ACER',65000,'CORE I5',500)";

		String updateQuery = "UPDATE Laptop.laptop_details SET BRAND='MACBOOK' WHERE ID=4";
		String deleteQuery = "DELETE FROM Laptop.laptop_details WHERE ID=5";

		String readSingleRowByID = "SELECT *FROM laptop_details WHERE ID=1";

		String readAllRecord = "SELECT*FROM laptop_details";


		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

			//		ResultSet resultSet = statement.executeQuery(readSingleRowByID);
			//		resultSet.next(); //resultset default pointing to col
			//		System.out.println("Id 1st row " + resultSet.getInt(1));
			//		System.out.println("BRAND 1st row " + resultSet.getString(2));
			//		System.out.println("PRICE 1st row " + resultSet.getInt(3));
			//		System.out.println("PROCESSR 1st row " + resultSet.getString(4));
			//		System.out.println("STORAGE 1st row " + resultSet.getInt(5));



			ResultSet resultSet = statement.executeQuery(readAllRecord);
			//	boolean isRowPresent = resultSet.next(); // 1 or 0
			//	while(isRowPresent) {

			while(resultSet.next()) {
				System.out.println("Id row:  " + resultSet.getInt(1));
				System.out.println("BRAND row: " + resultSet.getString(2));
				System.out.println("PRICE row: " + resultSet.getInt(3));
				System.out.println("PROCESSR row: " + resultSet.getString(4));
				System.out.println("STORAGE row: " + resultSet.getInt(5));
			}



			//     statement.executeUpdate(insertQuery1);
			//		System.out.println("first row is inserted");
			//		
			//		statement.executeUpdate(insertQuery2);
			//      System.out.println("second row is inserted");
			//		
			//	   statement.executeUpdate(insertQuery3);
			//	    System.out.println("third row is inserted");
			//		
			//		statement.executeUpdate(insertQuery4);
			//     System.out.println("four row is inserted");
			//		
			//		statement.executeUpdate(insertQuery5);
			//        System.out.println("fifth row is inserted");
			//        
			//      statement.executeUpdate(updateQuery);
			//       System.out.println("UPDATE 4TH ROW");
			//    
			//     statement.executeUpdate(deleteQuery);
			//     System.out.println("delete 5th ROW");

		} 
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());

			//sqlException.printStackTrace();
		} 
		catch (Exception classNotFoundException) {

			System.out.println(classNotFoundException.getMessage());

			//classNotFoundException.printStackTrace();	}

		}
		finally {
			if(connection != null) {
				System.out.println("connection closed");
			}
			else {
				System.out.println("connection is not closed");
			}

		}
	}



}
