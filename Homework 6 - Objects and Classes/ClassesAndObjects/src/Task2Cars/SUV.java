package Task2Cars;

public class SUV extends Car {

	private boolean highCrossing;

	public SUV(int price, boolean highCrossing) {
		super(price);
		this.highCrossing = highCrossing;
	}

	public boolean isHighCrossing() {
		return highCrossing;
	}

	public void setHighCrossing(boolean highCrossing) {
		this.highCrossing = highCrossing;
	}

}
