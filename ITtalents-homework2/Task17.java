//Да се състави програма, която извежда квадрат, чийто страни са
//оформени със знака *, а вътрешността е запълнена със въведен
//знак.
//Входни данни b - дължина на страната число от интервала
//[3..20], c - желан знак.
//Програмата да използва цикъл for.

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for square's side: ");
		int side = sc.nextInt();
		
		System.out.println("Enter symbol for the core");
		char ch = sc.next().charAt(0);

		while (side < 3 || side > 20) {

			System.out.println("Out of range. Enter again: ");
			side = sc.nextInt();
		}
		
		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				if ((i == 1) || (i == side) || (j == 1) || (j == side)) {
					System.out.print("*");
				} else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
