
//�� �� ������� ��������, ����� �� �������� ���������� ����� N �� ��������� [10..200] 
//������� � ������� ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 10 and 200");
		int number;

		do {
			number = sc.nextInt();

			if (number < 10 || number > 200) {
				System.out.println("Not in the desired interval, try again: ");
			}

		} while (number < 10 || number > 200);
		System.out.println("You have entered " + number);

		for (int i = 200; i >= 10; i--) {
			if (i < number && i % 7 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
