package Task3and4;

public class Deserts extends Stock {

	protected boolean iced;
	protected String taste;

	public Deserts(int price, boolean isAvaliable, boolean iced, String taste) {
		super(price, isAvaliable);
		this.iced = iced;
		this.taste = taste;
	}

	public boolean isIced() {
		return iced;
	}

	public void setIced(boolean iced) {
		this.iced = iced;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
}