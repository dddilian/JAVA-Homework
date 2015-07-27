import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Set array length: ");
		int length = input.nextInt();

		System.out.println("Fill the elements of the array: ");
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}

		Permute(array, 0);

		input.close();
	}

	public static void Permute(int[] array, int startindex) {

		int length = array.length;

		if (length == startindex + 1) {

			for (int i = 0; i < length; i++) {
				System.out.print(array[i] + ",  ");
			}
			System.out.println();

		} else {
			for (int i = startindex; i < length; i++) {

				int temp = array[i];
				array[i] = array[startindex];
				array[startindex] = temp;
				
				Permute(array, startindex + 1);

				temp = array[i];
				array[i] = array[startindex];
				array[startindex] = temp;
			}
		}
	}
}
