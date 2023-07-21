package Loops1;

public class UsePen {
public static void main(String[] args) {
	Refill r=new Refill();
	r.brand ="cello";
	r.price=10;
	r.color="bule";
	Pen p=new Pen();
	p.brand="camalini";
	p.price=20;
	p.rating=2.3f;
	p.refill=r;
	System.out.println(p.brand);
	System.out.println(p.refill.color);
	System.out.println(p.price+p.refill.price );
}
}
 