package com.laptop.dao;

import java.sql.*;

public class LaptopDAOImpl implements LaptopDAO {

	@Override
	public void saveLaptoprecord(int LaptopID, String LAPTOPBRAND, String LaptopPRIZE, String LaptopGENERATION,
			int LaptopSTORAGE) {
		System.out.println(" parameterized save Laptop record invoked");
		String insertQuery7 = "INSERT INTO laptop_details values(?,?,?,?,?)";
		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(insertQuery7);
			prepareStatement.setInt(1, LaptopID);
			prepareStatement.setString(2, LAPTOPBRAND);
			prepareStatement.setString(3, LaptopPRIZE);
			prepareStatement.setString(4, LaptopGENERATION);
			prepareStatement.setInt(5, LaptopSTORAGE);
			prepareStatement.executeUpdate();
			System.out.println("7th row is inserted");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}
	}

	@Override
	public void deleteLaptopByID(int ID) {
		System.out.println(" parameterized delete Laptop By ID invoked");
		String deleteQuery = "DELETE FROM LAPTOP.laptop_details WHERE ID=?";
		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(deleteQuery);
			prepareStatement.setInt(1, ID);
			prepareStatement.executeUpdate();

			System.out.println("3rd row is Deleted");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}
	}

	@Override
	public void updateBrandAndPrice(String BRAND, String PRICE) {

		System.out.println(" parameterized update Brand And Price invoked");
		String updateBrandAndPrice = "UPDATE Laptop.laptop_details SET BRAND=?,PRIZE=? WHERE ID=2";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(updateBrandAndPrice);
			prepareStatement.setString(1, BRAND);
			prepareStatement.setString(2, PRICE);
			prepareStatement.executeUpdate();

			System.out.println("UPDATE BRAND AND PRICE IN ID=2");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}
	}

	@Override
	public void updateBrand(String BRAND) {
		System.out.println(" parameterized update Brand invoked");
		String updateBrand = "UPDATE Laptop.laptop_details SET BRAND=? WHERE ID=7";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(updateBrand);
			prepareStatement.setString(1, BRAND);
			prepareStatement.executeUpdate();

			System.out.println("UPDATE BRAND IN ID=7");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}

	}

	// @Override
	// public void readSingleRecordById(int ID) {
	// System.out.println(" parameterized read Single Record By Id invoked");
	// String readSingleRecordById = "SELECT * FROM Laptop.laptop_details WHERE
	// ID=?";
	//
	// try {
	// Connection connection = LaptopConnection.getconnection();
	// PreparedStatement prepareStatement =
	// connection.prepareStatement(readSingleRecordById);
	// ResultSet resultSet = prepareStatement.executeQuery(readSingleRecordById);
	// resultSet.next();
	// System.out.println("Id row: " + resultSet.getInt(1));
	// System.out.println("BRAND row: " + resultSet.getString(2));
	// System.out.println("PRICE row: " + resultSet.getInt(3));
	// System.out.println("PROCESSR row: " + resultSet.getString(4));
	// System.out.println("STORAGE row: " + resultSet.getInt(5));
	// System.out.println("********************************************************");
	//
	//
	// System.out.println("read Single Record By Id");
	//
	// } catch (Exception classNotFoundException) {
	// System.out.println(classNotFoundException.getMessage());
	// }
	// }
	@Override

	public void readAllRecord() {

		System.out.println(" Read All Record invoked");
		String readAllRecord = "SELECT*FROM laptop_details";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(readAllRecord);

			ResultSet resultSet = prepareStatement.executeQuery(readAllRecord);

			while (resultSet.next()) {
				System.out.println("Id row:  " + resultSet.getInt(1));
				System.out.println("BRAND row: " + resultSet.getString(2));
				System.out.println("PRICE row: " + resultSet.getInt(3));
				System.out.println("PROCESSR row: " + resultSet.getString(4));
				System.out.println("STORAGE row: " + resultSet.getInt(5));

			}

		}

		catch (Exception classNotFoundException) {

			System.out.println(classNotFoundException.getMessage());

			classNotFoundException.printStackTrace();

		}

	}

	@Override
	public void readLaptopPriceByID(int ID) {
		System.out.println(" parameterized read Laptop Price By ID invoked");
		String readLaptopPriceByID = "SELECT PRIZE FROM laptop_details WHERE ID=?";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(readLaptopPriceByID);
			prepareStatement.setString(1, "PRIZE");
			prepareStatement.executeQuery();

			System.out.println("read Laptop Price By ID IN ID=7");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}

	}

	@Override
	public void readLaptopBrandByID(int ID) {
		System.out.println(" parameterized read Laptop Brand By ID invoked");
		String readLaptopBrandByID = "SELECT BRAND FROM laptop_details WHERE ID=?";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(readLaptopBrandByID);
			prepareStatement.setString(1, "BRAND");
			prepareStatement.executeQuery();

			System.out.println("read Laptop Brand By ID IN ID=7");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}

	}

	@Override
	public void readLaptopGenerationByID(int ID) {
		System.out.println(" parameterized read Laptop Generation By ID invoked");
		String readLaptopGenerationByID = "SELECT GENERATION FROM laptop_details WHERE ID=?";

		try {
			Connection connection = LaptopConnection.getconnection();
			PreparedStatement prepareStatement = connection.prepareStatement(readLaptopGenerationByID);
			prepareStatement.setString(1, "GENERATION");
			prepareStatement.executeQuery();

			System.out.println("read Laptop Generation By ID IN ID=7");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
		}

	}

}