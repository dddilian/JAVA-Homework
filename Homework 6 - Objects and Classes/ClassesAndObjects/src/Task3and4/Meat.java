package Task3and4;

public class Meat extends Stock {

	protected String type;
	protected int fats;

	public Meat(int price, boolean isAvaliable, String type, int fats) {
		super(price, isAvaliable);
		this.type = type;
		this.fats = fats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFats() {
		return fats;
	}

	public void setFats(int fats) {
		this.fats = fats;
		
	}
}