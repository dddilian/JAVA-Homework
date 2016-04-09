//По зададено число n, да се изведе на екрана таблица по
//следния начин:

import java.util.Scanner;

public class Task8a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 4.");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			for (int row = 0; row < 1; row++) {
				System.out.println(row);
			}
			break;

		case 2:
			for (int row = 1; row <= 2; row++) {
				for (int col = 1; col <= 2; col++) {
					if (row == 1) {
						System.out.print("1");
					} else if (row == 2) {
						System.out.print("3");
					}
				}
				System.out.println();
			}
			break;

		case 3:
			for (int row = 1; row <= 3; row++) {
				for (int col = 1; col <= 3; col++) {
					if (row == 1) {
						System.out.print("2");
					} else if (row == 2) {
						System.out.print("4");
					} else if (row == 3) {
						System.out.print("6");
					}
				}
				System.out.println();
			}
			break;

		case 4:
			for (int row = 1; row <= 4; row++) {
				for (int col = 1; col <= 4; col++) {
					if (row == 1) {
						System.out.print("3");
					} else if (row == 2) {
						System.out.print("5");
					} else if (row == 3) {
						System.out.print("7");
					} else if (row == 4) {
						System.out.print("9");
					}
				}
				System.out.println();
				System.out.println();
			}
			break;
			
			default:
				System.out.println("Number isn't between 1 and 4!");

		}
		sc.close();
	}
}
