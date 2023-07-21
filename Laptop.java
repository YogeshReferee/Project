package Loops1;

public class Laptop {
	private String brand;
	private int price;
	private int ram;
	private String model;
	private Battery battery;

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBrand(String Barnd) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int Price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setRam(int Ram) {
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}

	public void setModel(String Model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public Laptop(String brand, int price, int ram, String model, Battery battery) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.model = model;
		this.battery = battery;
	}

	public String toString() {
		return brand + " " + price + " " + ram + " " + model + " " + battery;
	}
}
