package Task3and4;

public class Vegetables extends Stock {

	protected boolean isInJar;
	protected boolean isFromHotHouse;

	public Vegetables(int price, boolean isAvaliable, boolean isInJar, boolean isFromHotHouse) {
		super(price, isAvaliable);
		this.isInJar = isInJar;
		this.isFromHotHouse = isFromHotHouse;
	}

	public boolean isInJar() {
		return isInJar;
	}

	public void setInJar(boolean isInJar) {
		this.isInJar = isInJar;
	}

	public boolean isFromHotHouse() {
		return isFromHotHouse;
	}

	public void setFromHotHouse(boolean isFromHotHouse) {
		this.isFromHotHouse = isFromHotHouse;
	}
}
