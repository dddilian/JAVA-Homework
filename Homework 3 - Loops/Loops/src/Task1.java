import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for loop's lenght: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % (3 * 7) != 0) {    // ����-> ((i % 3 != 0) && (i % 7 != 0)) �� ������ �������� ������� &&. 
				System.out.println(i);
			}
		}
		input.close();
	}
}
