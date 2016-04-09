//Едно число X е палиндром, aко се чете еднакво отпред назад и
//отзад напред.
//Да се състави програма, която проверява дали въведено число е
//палиндром.
//Входни данни: N - естествено число от интервала [10 .. 30000].
//Пример: 17571
//Изход: числото е палиндром
//Използвайте цикъл do-while.

import java.util.Scanner;

public class Task24bPalidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("Enter a number between 10 and 30 000 to be checked if it's palindrome: ");

		do {
			number = sc.nextInt();

			if (number < 10 || number > 30000) {
				System.out.println("Not in the desired interval, try again: ");
			}

		} while (number < 10 || number > 30000);

		System.out.println("You have entered " + number);

		boolean isPalindrome = true;

		int palindrome;

		palindrome = number;
		int reverse = 0;

		do {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		
		} while (number != 0);

		if (palindrome != reverse) {
			isPalindrome = false;
		}

		if (isPalindrome == true) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		sc.close();
	}
}
