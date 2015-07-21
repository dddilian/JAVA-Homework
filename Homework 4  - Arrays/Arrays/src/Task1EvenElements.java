import java.util.Scanner;

public class Task1EvenElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter a number for array length: ");
		int n = input.nextInt();
		int[] array = new int[n];
		int even = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number for element " + i);
			array[i] = input.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even = even + array[i];
			}
		}
		System.out.println("The sum of all even elements is: " + even);
		input.close();
	}
}