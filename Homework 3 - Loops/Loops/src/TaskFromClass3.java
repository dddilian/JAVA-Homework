import java.util.Scanner;

public class TaskFromClass3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int result = 0;        // ��������� �� �����, ������ �� ������� ���������� �����, �.�. �� �� ������� � �� �� ��������� ������ ��.

		for (;;) {             // �������� for �����

			System.out.println("Enter a number: ");
			int number = input.nextInt();

			if (number == 0) {
				break;
			}

			result = result + number;
		}
		
		System.out.println("The result is: " + result);

		input.close();
	}
}