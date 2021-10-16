package com.laptop.dao;

public interface LaptopDAO {

	void saveLaptoprecord(int LaptopID, String LAPTOPBRAND, String LaptopPRIZE, String LaptopGENERATION,
			int LaptopSTORAGE);

	void deleteLaptopByID(int ID);

	void updateBrandAndPrice(String BRAND, String PRICE);

	void updateBrand(String BRAND);

	// void readSingleRecordById(int ID);

	void readAllRecord();

	void readLaptopPriceByID(int ID);

	void readLaptopBrandByID(int ID);

	void readLaptopGenerationByID(int ID);
}
