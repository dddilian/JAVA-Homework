import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 4.");
		int n = sc.nextInt();

		switch (n) {

		case 1:
			for (int i = 0; i < 1; i++) {
				System.out.println(i);
			}
			break;

		case 2:
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					if ((i == 2 || j == 2) || (i == 1 && j == 3) || (i == 3 && j == 1)) {
						continue;
					}
					System.out.println(i + "" + j);
				}
			}
			break;

		case 3:
			for (int a = 1; a <= 6; a++)
				for (int b = 0; b <= 6; b++)
					for (int c = 0; c <= 6; c++)
						if (a == b && b == c) {
							if (a != 2 && a != 4 && a != 6) {
								continue;
							}
							System.out.println(a + "" + b + "" + c);
						}
			break;

		case 4:
			for (int a = 1; a <= 9; a++)
				for (int b = 0; b <= 9; b++)
					for (int c = 0; c <= 9; c++)
						for (int d = 0; d <= 9; d++)
							if (a == b && b == c && c == d) {
								if (a != 3 && a != 5 && a != 7 && a != 9) {
									continue;
								}
								System.out.println(a + "" + b + "" + c + "" + d);
							}
			break;

		default:
			System.out.println("Number isn't between 1 and 4!");
		}
		sc.close();
	}
}
