package com.laptop.useingencapsulation;

import java.sql.*;

import com.laptop.entity.LaptopEntity;


public class LaptopDAOImpl implements LaptopDAO {

	@Override
	public void saveLaptopRecord(LaptopEntity laptopEntity) {
		System.out.println("invoked saveLaptopRecord(LaptopEntity laptopEntity)");
		String insertQuery = "INSERT INTO laptop_details VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		try {
			Connection connection = LaptopConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, laptopEntity.getId());
			preparedStatement.setString(2, laptopEntity.getBrand());
			preparedStatement.setString(3, laptopEntity.getPrize());
			preparedStatement.setString(4, laptopEntity.getGeneration());
			preparedStatement.setInt(5, laptopEntity.getStorage());
			preparedStatement.setString(6, laptopEntity.getColor());
			preparedStatement.setInt(7, laptopEntity.getRam());
			preparedStatement.setBoolean(8, laptopEntity.isCamerPresent());
			preparedStatement.setBoolean(9, laptopEntity.isCDSupported());
			preparedStatement.setInt(10, laptopEntity.getWeight());
			preparedStatement.setInt(11, laptopEntity.getScreensize());

			preparedStatement.executeUpdate();
			System.out.println("one row is inserted");

		} catch (SQLException sqlexception) {

			System.out.println("inside catch block SQL exception");
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}

	}

}
