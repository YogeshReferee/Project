package Loops1;

public class Battery {
	private String brand;
	private int price;
	private int capacity;
	private String model;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int   getprice() {
		return price;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return  model;
	}
	public Battery(String brand, int price, int capacity, String model) {
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
		this.model=model;
	}
	public String toString() {
		return brand+" "+price+" "+capacity+" "+model;
	
	}
	
}

