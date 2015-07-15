import java.util.Scanner;

public class TaskFromClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an integer:");
		int n = input.nextInt();

		System.out.println("Please enter an integer:");
		int m = input.nextInt();

		int powered = 0;

		for (int i = 1; i <= m; i++) {

			powered = powered + n;
		}
		System.out.println(powered);

		input.close();
	}
}