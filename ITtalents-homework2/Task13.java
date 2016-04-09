//Да се състави програма, която извежда всички естествени трицифрени числа,
//които имат сбор на цифрите равен на дадено число.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		for (int i = 100; i <= 999; i++) {

			int hundreds = i / 100;
			int tens = (i / 10) % 10;
			int ones = (i % 100)%10;

			if ((ones) + (tens) + (hundreds) != number) {
				continue;

			} else {
				System.out.println(i);
			}
		}
		sc.close();
	}
}