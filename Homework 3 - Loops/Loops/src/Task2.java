import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers.");

		int biggest = 0;
		int smallest = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a number: ");
			int n = input.nextInt();
			
			if (i == 1) {
				biggest = n;
				smallest = n;
				
			} else if (n > biggest) {
				biggest = n;

			} else if (n < smallest) {
				smallest = n;
			}
		}
		System.out.println("The biggest is: " + biggest);
		System.out.println("The smallest is: " + smallest);
		input.close();
	}
}