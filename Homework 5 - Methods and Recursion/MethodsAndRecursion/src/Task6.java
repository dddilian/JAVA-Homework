import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for \"n\" = ");
		int n = input.nextInt();
		
		long factorial = factorial(n);
		System.out.printf("%d! = %d%n", n, factorial);
		input.close();
	}

	public static long factorial(int n) {

		if (n == 0) {       // ���� �� ����������
			return 1;
		}

		// ������� ���� ��� ���� �� /���������� ���������/:
		else {
			return n * factorial(n - 1);
		}

	}
}