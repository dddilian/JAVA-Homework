import java.util.Scanner;

public class Task10ANWithoutRemainder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter two numbers - \"a\" and \"b\". \"b\" should be bigger than \"a\": ");
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();

		if (b < a) {
			System.out.println("Enter a is smaller");
		} else {
			System.out.println("The numbers below are divided by 3 without remainder");
			for (int i = a; i <= b; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
		input.close();
	}
}