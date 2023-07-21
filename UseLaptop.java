package Loops1;

public class UseLaptop {
	public static void main(String[] args) {
		Battery b= new Battery("nokia",5000,300, "i3s"  );
		Laptop l = new Laptop("Lenova", 20000, 8, "linaxu", b);
		System.out.println(l);
		System.out.println(l.getPrice()+b.getprice());
	
	}

}
