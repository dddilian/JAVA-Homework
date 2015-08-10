package Task2Cars;

public class Automobile extends Car {

	protected double fuelConsuption;

	public Automobile(int price, double fuelConsuption) {
		super(price);                                        //��� Super �� ��������, �� �������� ���� �� ������� ���� /Car/.
		this.fuelConsuption = fuelConsuption;
	}

	public double getFuelConsuption() {
		return fuelConsuption;
	}

	public void setFuelConsuption(double fuelConsuption) {
		this.fuelConsuption = fuelConsuption;
	}
	
	
}
