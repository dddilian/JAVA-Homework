import java.util.Scanner;

public class Task6Bubble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter a number for array length: ");
		int n = input.nextInt();
		int[] array = new int[n];
		
		int j;
		boolean flag = true;                // set flag to true to begin first pass
		int temp;                          // holding variable


		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number for element " + i);
			array[i] = input.nextInt();
		}
		System.out.println(java.util.Arrays.toString(array));

	
		while(flag) {
		flag = false;                                // set flag to false awaiting a possible swap
		for (j = 0; j < array.length - 1; j++) {
			if (array[j] > array[j + 1])             // ������ �� �� ����� �� ��-������ < for �� ��������� � �������� ��� ���!!!!!!!
			{
				temp = array[j]; // swap elements
				array[j] = array[j + 1];
				array[j + 1] = temp;
				flag = true; // shows a swap occurred
			}
		}
		}
		System.out.println(java.util.Arrays.toString(array));
		input.close();
	}
}
	