package Task3and4;

public class Fruits extends Stock {

	protected String origin;
	protected String kind;

	public Fruits(int price, boolean isAvaliable, String origin, String kind) {
		super(price, isAvaliable);
		this.origin = origin;
		this.kind = kind;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;

	}
}