import java.util.Scanner;

public class Task5Array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter start: ");
		int start = input.nextInt();
		if(start <=10){
			System.out.println("Wrong start point!");
		} else {
		System.out.print("Enter end: ");
		int end = input.nextInt();
		
		printSymmetrical(start, end);}
		input.close();
	}

	public static void printSymmetrical(int start, int end) {

		for (int i = start; i <= end; i++) {
			char[] arr = Integer.toString(i).toCharArray();
			boolean symmetric = true;

			for (int j = 0, m = 1; j < arr.length / 2; j++, m++) {
				if (symmetric) {
					if (arr[j] != arr[arr.length - m]) {
						symmetric = false;
					}
				}
			}
			if (symmetric) {
				System.out.print(i + " ");
			}
		}
	}
}