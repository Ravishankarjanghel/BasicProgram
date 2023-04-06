package CollectionFramework;

public class Pen {
	int price;
	String brand;
	public Pen(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Pen's price is " + price + " and brand is " + brand ;
	}
	
}
