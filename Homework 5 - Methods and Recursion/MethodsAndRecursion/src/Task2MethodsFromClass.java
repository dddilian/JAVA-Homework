import java.util.Arrays;
import java.util.Scanner;

public class Task2MethodsFromClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter elements without pressing enter between them: ");
		char[] array = input.next().toCharArray();

		System.out.println("Array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println();
		printReversed(array);
		input.close();
	}
	
	public static void printReversed(char[] array) {

		int length = array.length;
		char[] reversed = new char[length];

		for (int i = 0; i < length; i++) {
			reversed[length - 1 - i] = array[i];
		}
		System.out.println("Reversed: ");
		System.out.println(Arrays.toString(reversed));
	}
}