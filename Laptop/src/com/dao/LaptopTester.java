package com.dao;

public class LaptopTester {
	public static void main(String args[]) {
		LaptopDAO laptopDAOImpl = new LaptopDAOImpl();
		laptopDAOImpl.saveLaptoprecord();
		laptopDAOImpl.updateBrandAndPrice();
		laptopDAOImpl.updateBrand();
		laptopDAOImpl.deleteLaptopByID();
		laptopDAOImpl.readSingleRecordById();
		laptopDAOImpl.readAllRecord();
		laptopDAOImpl.readLaptopPriceByID();
		laptopDAOImpl.readLaptopBrandByID();
		laptopDAOImpl.readLaptopGenerationByID();
	}
}
