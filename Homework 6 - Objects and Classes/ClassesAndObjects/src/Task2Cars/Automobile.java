package Task2Cars;

public class Automobile extends Car {

	protected double fuelConsuption;

	public Automobile(int price, double fuelConsuption) {
		super(price);                                        //със Super се означава, че ползваме нещо от базовия клас /Car/.
		this.fuelConsuption = fuelConsuption;
	}

	public double getFuelConsuption() {
		return fuelConsuption;
	}

	public void setFuelConsuption(double fuelConsuption) {
		this.fuelConsuption = fuelConsuption;
	}
	
	
}
