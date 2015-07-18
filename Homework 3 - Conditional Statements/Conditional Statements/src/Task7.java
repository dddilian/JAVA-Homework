import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter 3 numbers for the sides of a triangle: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a < (b + c) && b < (a + c) && c < (a + b)) {
			System.out.println("Triangle can be formed with these numbers.");
		} else {
			System.out.println("It's impossible to form a triangle with some of those numbers.");
		}
		input.close();
	}
}