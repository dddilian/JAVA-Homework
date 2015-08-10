package Task1Cat;

public class ManipulateCat {

	public static void main(String[] args) {

		Cat[] arrayCats = new Cat[10];

		arrayCats[0] = new Cat("Cat1", 1);
		arrayCats[1] = new Cat("Cat2", 2);
		arrayCats[2] = new Cat("Cat3", 3);
		arrayCats[3] = new Cat("Cat4", 4);
		arrayCats[4] = new Cat("Cat5", 5);
		arrayCats[5] = new Cat("Cat6", 6);
		arrayCats[6] = new Cat("Cat7", 7);
		arrayCats[7] = new Cat("Cat8", 8);
		arrayCats[8] = new Cat("Cat9", 9);
		arrayCats[9] = new Cat("Cat10", 10);

		for (Cat cat : arrayCats) {

			cat.sayMiau();
		}
	}
}