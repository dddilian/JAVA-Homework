//Да се въведат от потребителя 2 числа. И да се
//изведат на екрана всички числа от по-малкото до по-голямото.

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers:");
		System.out.print("Enter x: ");
		int x = sc.nextInt();

		System.out.print("Enter y: ");
		int y = sc.nextInt();

		int temp;

		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}

		for (int i = x; i <= y; i++) {
			System.out.print(" " + i);
		}
		sc.close();
	}
}