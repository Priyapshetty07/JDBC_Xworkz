package com.dao;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

public class LaptopDAOImpl implements LaptopDAO{

	@Override
	public void saveLaptoprecord() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String insertQuery1 = "INSERT INTO laptop_details value(1,'DELL',35000,'CORE I5',500)";
		String insertQuery2 = "INSERT INTO laptop_details value(2,'HP',50000,'CORE I7',600)";
		String insertQuery3 = "INSERT INTO laptop_details value(3,'LENOVA',45000,'CORE I7',700)";
		String insertQuery4 = "INSERT INTO laptop_details value(4,'HP',95000,'CORE I3',600)";
		String insertQuery5 = "INSERT INTO laptop_details value(5,'ACER',65000,'CORE I5',500)";
		String insertQuery6 = "INSERT INTO laptop_details value(6,'HP',85000,'CORE I3',400)";

		try {


			connection = DriverManager.getConnection(url, userName, password);

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

			statement.executeUpdate(insertQuery6);
			System.out.println("Sixth row is inserted");

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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateBrandAndPrice() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;

		String updateBrandAndPrice = "UPDATE Laptop.laptop_details SET BRAND='DELL',  PRIZE=56500 WHERE ID=1";

		try {

			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement(); //to put sql query to java
			statement.executeUpdate(updateBrandAndPrice);
			System.out.println("UPDATEBRANDANDPRICE 1th row");
		} 
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		} 
		catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}

		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	@Override
	public void deleteLaptopByID() {

		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;

		String deleteQuery = "DELETE FROM Laptop.laptop_details WHERE ID=2";

		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement(); //to put sql query to java

			statement.executeUpdate(deleteQuery);
			System.out.println("delete 2nd ROW");

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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void updateBrand() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;

		String updateQuery = "UPDATE Laptop.laptop_details SET BRAND='MACBOOK' WHERE ID=6";

		try {

			connection = DriverManager.getConnection(url, userName, password);

			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement(); //to put sql query to java

			statement.executeUpdate(updateQuery);
			System.out.println("UPDATE 6th row");
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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	@Override
	public void readSingleRecordById() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;

		String readSingleRowByID = "SELECT *FROM laptop_details WHERE ID=3";

		try {
			connection = DriverManager.getConnection(url, userName, password);

			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readSingleRowByID);
			resultSet.next(); //resultset default pointing to col
			System.out.println("Id 3RD row " + resultSet.getInt(1));
			System.out.println("BRAND 3RD row " + resultSet.getString(2));
			System.out.println("PRICE 3RD row " + resultSet.getInt(3));
			System.out.println("PROCESSR 3RD row " + resultSet.getString(4));
			System.out.println("STORAGE 3RD row " + resultSet.getInt(5));

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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	@Override

	public void readAllRecord() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String readAllRecord = "SELECT*FROM laptop_details";

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}


	@Override
	public void readLaptopPriceByID() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String readLaptopPriceByID = "SELECT PRIZE FROM laptop_details WHERE ID=4";

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopPriceByID);
			resultSet.next();
			System.out.println("READ LaptopPriceByID 4TH row " +  resultSet.getDouble(1));

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
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}


	@Override
	public void readLaptopBrandByID() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String readLaptopBrandByID = "SELECT BRAND FROM laptop_details WHERE ID=4";

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopBrandByID);
			resultSet.next();
			System.out.println("READ LaptopBrandByID 4TH row " +  resultSet.getString(1));

		}
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		} 
		catch (Exception classNotFoundException) {

			System.out.println(classNotFoundException.getMessage());

		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}




	@Override
	public void readLaptopGenerationByID() {

		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="priyadiya0713shetty"; 
		Connection connection = null;	

		String readLaptopGenerationByID = "SELECT GENERATION FROM laptop_details WHERE ID=4";

		try {

			//Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			//DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readLaptopGenerationByID);
			resultSet.next();
			System.out.println("READ LaptopBrandByID 4TH row " +  resultSet.getString(1));

		}
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
		} 
		catch (Exception classNotFoundException) {

			System.out.println(classNotFoundException.getMessage());

		}

		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("********************************************************");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}

