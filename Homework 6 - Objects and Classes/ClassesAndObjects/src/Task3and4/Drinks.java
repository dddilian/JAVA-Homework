package Task3and4;

public class Drinks extends Stock {

	protected boolean isAlcoholic;
	protected String mark;

	public Drinks(int price, boolean isAvaliable, boolean isAlcoholic, String mark) {
		super(price, isAvaliable);
		this.isAlcoholic = isAlcoholic;
		this.mark = mark;
	}

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
		
	}
}