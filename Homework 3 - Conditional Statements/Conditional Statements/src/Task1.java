import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an integer:");
		int a = input.nextInt();

		System.out.println("Please enter an integer:");
		int b = input.nextInt();

		int result = a - b;

		if (result > 0) {
			System.out.println("+");
		} else if (result < 0) {
			System.out.println("-");
		} else {
			System.out.println("0");
		}

		input.close();
	}
}