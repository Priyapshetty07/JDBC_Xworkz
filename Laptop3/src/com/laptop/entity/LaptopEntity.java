package com.laptop.entity;

public class LaptopEntity {
	int id;
	String brand;
	String prize;
	String generation;
	int storage;
	String color;
	int ram;
	boolean isCamerPresent;
	boolean isCDSupported;
	int weight;
	int screensize;

	public LaptopEntity(int id, String brand, String prize, String generation, int storage, String color, int ram,
			boolean isCamerPresent, boolean isCdSupported, int weight, int screensize) {
		this.id = id;
		this.brand = brand;
		this.prize = prize;
		this.generation = generation;
		this.storage = storage;
		this.color = color;
		this.ram = ram;
		this.isCamerPresent = isCamerPresent;
		this.isCDSupported = isCdSupported;
		this.weight = weight;
		this.screensize = screensize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isCamerPresent() {
		return isCamerPresent;
	}

	public void setCamerPresent(boolean isCamerPresent) {
		this.isCamerPresent = isCamerPresent;
	}

	public boolean isCDSupported() {
		return isCDSupported;
	}

	public void setCDSupported(boolean isCDSupported) {
		this.isCDSupported = isCDSupported;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getScreensize() {
		return screensize;
	}

	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}

	


}
