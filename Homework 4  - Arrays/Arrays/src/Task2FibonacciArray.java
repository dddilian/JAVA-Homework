import java.util.Scanner;

public class Task2FibonacciArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter a number for array length: ");
		int n = input.nextInt();
		int[] array = new int[n];

		array[0] = 0;
		array[1] = 1;
		System.out.print(" " + array[0]);
		System.out.print(" " + array[1]);

		for (int i = 2; i < n; i++) {
			array[i] = array[i - 1] + array[i - 2];
			System.out.print(" " + array[i]);
		}
		input.close();
	}
}