package Task3and4;

public class Store {

	protected String name;
	protected String location;
	protected Stock[] goodsArray;

	public Store(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String[] args) {

		Stock saider = new Drinks(2, true, true, "Somersby");
		Stock cola = new Drinks(1, true, false, "Coca-Cola");
		Stock pancake = new Deserts(3, true, false, "sweet");
		Stock icecream = new Deserts(2, true, true, "sweet");
		Stock orange = new Fruits(2, false, "Greece", "special");
		Stock tomato = new Vegetables(4, true, false, false);
		Stock chicken = new Meat(20, true, "fillet", 30);

		Stock[] goodsArray = { saider, cola, pancake, icecream, orange, tomato, chicken };

	}

	public void addProduct(Stock product) {
		if (product.isAvailable == true)
		{
			System.out.println("The product was added.");
		}
	}

	public void noProduct(Stock product) {

		if (product.isAvailable == false)
		{
			System.out.println("The product is no longer available.");
		}
	}
}
