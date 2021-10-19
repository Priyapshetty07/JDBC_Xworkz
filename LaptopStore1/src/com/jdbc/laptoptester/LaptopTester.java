package com.jdbc.laptoptester;

import java.util.List;
import com.jdbc.laptop.entity.LaptopEntity;
import com.jdbc.laptops.LaptopDAOImpl;

public class LaptopTester {
	public static void main(String[] args) {

		LaptopDAOImpl laptopdao = new LaptopDAOImpl();
		List<LaptopEntity> allrecords = laptopdao.readAllRecord();
		for (LaptopEntity laptopEntity : allrecords) {
			System.out.println(laptopEntity + "/t");
			System.out.println();
			System.out.println("-----------------------------");

		}
	}
}
