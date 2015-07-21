import java.util.Scanner;

public class Task3ElementsIndex10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in, "UTF-8");

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {

			array[i] = i * 10;

			// System.out.printf("element[%d] = %s%n", i, array[i]); първи начин за принтиране на масив
		}
		System.out.println(java.util.Arrays.toString(array));  //втори начин за принтиране на масив
		input.close();
	}
}