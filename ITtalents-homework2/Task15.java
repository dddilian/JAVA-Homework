import java.util.Scanner;

//�� �� ������� ��������, ����� �� ������� ������ �� ������ ����� �� 1 �� �������� ����� N.
//������: 5
//�����: 15
//����������� ����� do-while.

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int start = 1;
		int sum = 0;

		do {
			sum = start + sum;
			start++;
		} while (start <= number);

		System.out.println(sum);
		sc.close();
	}
}