import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int random1 = rand.nextInt(100);
		int random2 = rand.nextInt(100);
		int random3 = rand.nextInt(100);

		for (int i = 1; i <= 20; ++i) {
			printingRandom(random1, random2, random3);
		}

	}

	public static void printingRandom(int random1, int random2, int random3) {

		long temp = 0;

		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);

		temp = random1 * random2 * random3;
		System.out.println("The result from multiplying the 3 random numbers: " + temp);

	}
}
