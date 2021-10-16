package com.laptop.tester;

import com.laptop.dao.LaptopDAO;
import com.laptop.dao.LaptopDAOImpl;

public class LaptopTester {
	public static void main(String args[]) {

		LaptopDAO laptopDAOImpl = new LaptopDAOImpl();
		System.out.print("*************************************");

		laptopDAOImpl.saveLaptoprecord(7, "LENOVO", "45000", "CORE I7", 500);
		System.out.print("*************************************");

		laptopDAOImpl.deleteLaptopByID(3);
		System.out.print("*************************************");

		laptopDAOImpl.updateBrandAndPrice("MAC", "66500");
		System.out.print("*************************************");

		laptopDAOImpl.updateBrand("ACER");
		System.out.print("*************************************");

		// laptopDAOImpl.readSingleRecordById(1);
		// System.out.print("*************************************");

		laptopDAOImpl.readAllRecord();
		System.out.print("*************************************");

		laptopDAOImpl.readLaptopPriceByID(7);
		System.out.print("*************************************");

		laptopDAOImpl.readLaptopBrandByID(7);
		System.out.print("*************************************");

		laptopDAOImpl.readLaptopGenerationByID(7);
		System.out.print("*************************************");
	}

}
