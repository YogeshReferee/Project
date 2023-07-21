package Loops1;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("Honda");
		c1.setColour("bule");
		c1.setRating(2.4f);
		c1.setModel("new");
		c1.setPrice(10000);
		System.out.println(c1.getBrand());
		System.out.println(c1.getColour());
		System.out.println(c1.getModel());
		System.out.println(c1.getPrice());
		System.out.println(c1.getRating());

	}
}
