//Започвайки от 3, да се изведат на екрана първите n
//числа, които се делят на 3. Числата да са разделени със запетая.

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number length: ");
		int x = sc.nextInt();
		int start = 3;
		int counter = 0;

		while (counter < x) {
			if (start % 3 == 0) {
				System.out.print(start + ", ");
				counter++;
			}
			start++;
		}
		sc.close();
	}
}
