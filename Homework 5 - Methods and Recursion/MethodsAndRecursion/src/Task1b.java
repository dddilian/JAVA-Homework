import java.util.Scanner;

public class Task1b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter number one: ");
		int num1 = input.nextInt();

		System.out.print("Enter number two: ");
		int num2 = input.nextInt();

		System.out.print("Enter number three: ");
		int num3 = input.nextInt();

		if (num3 < num1 || num3 < num2) {
			Task1.maxNumber(num1, num2);
		} else {
			System.out.println("Max is: " + num3);
		}
		input.close();
	}
}