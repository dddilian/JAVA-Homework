//Въведете число от клавиатурата и определете дали е просто.

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to see if it's prime: ");
		int x = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime!");
		}
		sc.close();
	}
}