package com.jdbc.laptops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.laptop.entity.LaptopEntity;

public class LaptopDAOImpl {
	public List<LaptopEntity> readAllRecord() {
		System.out.println("invoked readAllRecordById");
		String readAllRecord = "SELECT * FROM laptop_details; ";

		List<LaptopEntity> container = new ArrayList<LaptopEntity>();
		LaptopEntity laptopEntity = null;
		try {
			Connection connection = ConnectionEstablish.getconnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readAllRecord);

			ResultSet resultset = preparedstatement.executeQuery(readAllRecord);
			while (resultset.next()) {
				int id = resultset.getInt(1);
				String brand = resultset.getString(2);
				String color = resultset.getString(3);
				int price = resultset.getInt(4);
				String processor = resultset.getString(5);
				int screensize = resultset.getInt(6);
				int weight = resultset.getInt(7);
				boolean graphicard = resultset.getBoolean(8);
				boolean screentouch = resultset.getBoolean(9);

				laptopEntity = new LaptopEntity(id, brand, color, price, processor, screensize, weight, graphicard,
						screentouch);
				container.add(laptopEntity);
			}
		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		return container;

	}

}
