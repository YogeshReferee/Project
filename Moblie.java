package Loops1;

public class Moblie {
	String brand;
	int price;
	String model;
	int ram;

	public Moblie(String brand, int price, String model, int ram) {
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.ram = ram;
	}

	public String toString() {
		return "Brand= " + " " + brand + "Price= " + price + " " + "Model= " + model + " " + "Ram= " + ram;
	}
}
