import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers. ");

		System.out.println("Enter number one: ");
		int number1 = input.nextInt();

		System.out.println("Enter number two: ");
		int number2 = input.nextInt();

		System.out.println("Enter number three: ");
		int number3 = input.nextInt();

		int biggest = number1;

		if (number2 >= biggest) {
			if (number2 >= number3) {
				biggest = number2;

			} else {
				biggest = number3;
			}
		} else {
			if (number3 >= biggest) {
				biggest = number3;
			}
		}
		System.out.println("The biggest number is:" + biggest);
		input.close();
	}
}