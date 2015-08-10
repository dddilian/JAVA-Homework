package Task3and4;

public abstract class Stock {

	int price;
	boolean isAvailable;

	public Stock(int price, boolean isAvaliable) {
		super();
		this.price = price;
		this.isAvailable = isAvaliable;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvaliable() {
		return isAvailable;
	}

	public void setAvaliable(boolean isAvaliable) {
		this.isAvailable = isAvaliable;
	}

	public void printPrice() {
		System.out.printf("The price of the product is " + this.price + " dollars.");
	}
}
