package com.dao;

public interface LaptopDAO {
	void saveLaptoprecord();

	void updateBrand();

	void updateBrandAndPrice();

	void deleteLaptopByID();

	void readSingleRecordById();

	void readAllRecord();

	void readLaptopPriceByID();

	void readLaptopBrandByID();

	void readLaptopGenerationByID();

}
