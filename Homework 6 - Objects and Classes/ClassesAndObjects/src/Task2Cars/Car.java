package Task2Cars;

public class Car {

	private int price;

	public Car(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printPrice() {
		
		System.out.println("The price of the car is: " + this.price);
	}
}