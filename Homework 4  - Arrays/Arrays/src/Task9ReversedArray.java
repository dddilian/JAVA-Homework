import java.util.Arrays;
import java.util.Scanner;

public class Task9ReversedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter a number for array length:");
		int n = input.nextInt();

		int[] array = new int[n];
		System.out.println(Arrays.toString(array));

		int length = array.length;

		int[] reversed = new int[length];

		for (int i = 0; i < length; i++) {
			reversed[length - 1 - i] = array[i];
		}
		System.out.println(Arrays.toString(reversed));
		input.close();
	}
}