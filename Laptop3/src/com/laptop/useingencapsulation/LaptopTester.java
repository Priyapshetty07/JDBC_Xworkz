package com.laptop.useingencapsulation;

import com.laptop.entity.LaptopEntity;

public class LaptopTester {
	public static void main(String args[]) {
		LaptopDAO laptopDAO = new LaptopDAOImpl();

		LaptopEntity laptopEntity = new LaptopEntity(8, "Macbook", "90000", "MacOS 10.14", 8000, "Space Grey", 8, true,
				false, 3, 13);
		laptopDAO.saveLaptopRecord(laptopEntity);
	}

}
