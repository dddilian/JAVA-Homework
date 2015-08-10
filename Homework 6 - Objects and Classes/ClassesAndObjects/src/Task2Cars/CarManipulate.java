package Task2Cars;

public class CarManipulate {

	public static void main(String[] args) {

		Car Mercedes = new Automobile(90000, 9);
		Car BMW = new Automobile(100000, 9);
		Car Audi = new Automobile(80000, 9);
		Car Opel = new Automobile(40000, 9);
		Car VW = new Automobile(80000, 7);
		Car Nissan = new SUV(60000, true);
		Car Mitsubishi = new SUV(50000, true);
		Car SsangYong = new SUV(20000, false);
		Car Toyota = new SUV(60000, true);
		Car Suzuki = new SUV(25000, true);

		Car[] arrayCars = { Mercedes, BMW, Audi, Opel, VW, Nissan, Mitsubishi, SsangYong, Toyota, Suzuki };

		sortPrices(arrayCars);

		for (Car car : arrayCars) {
			car.printPrice();
		}

	}

	public static void sortPrices(Car[] arrayCars) {

		for (int i = 0; i < arrayCars.length; i++) {

			for (int j = 1; j <= (arrayCars.length - 1 - i); j++) {
				if (arrayCars[j - 1].getPrice() < arrayCars[j].getPrice()) { //сменяме знака за низходящ или възходящ сорт
					int swap = arrayCars[j - 1].getPrice();
					arrayCars[j - 1].setPrice(arrayCars[j].getPrice());
					arrayCars[j].setPrice(swap);
					
				}
			}
		}
	}
}