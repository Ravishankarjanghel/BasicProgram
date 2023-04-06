package CollectionFramework;

public class Car extends Vehicle{
	float mileage;

	public Car(long price, String brand, String model, float mileage) {
		super(price, brand, model);
		this.mileage = mileage;
	}
	
	public String toString() {
		return "\nBrand : "+ brand + "\nModel : " + model +"\nPrice : " + price +  "\nMileage : " + mileage+ "\n";
	}
}
