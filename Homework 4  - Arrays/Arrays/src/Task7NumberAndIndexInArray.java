import java.util.Scanner;

public class Task7NumberAndIndexInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		int[] array = { 2, 1, 68, 5, 666, 6, 7, 8, 78, 166 };
		System.out.println("The numbers, that the array contains, are: 2, 1, 68, 1, 666, 6, 7, 8, 68, 166");

		System.out.println("Enter one of the numbers to see its index in the array:");
		int n = input.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (n == array[i]) {
				System.out.println("The index of that element is: " + i);
			}
		}
		input.close();
	}
}