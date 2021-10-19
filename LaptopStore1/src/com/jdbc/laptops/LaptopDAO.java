package com.jdbc.laptops;

import java.util.List;

import com.jdbc.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	List<LaptopEntity> readAllRecord();
	

}
