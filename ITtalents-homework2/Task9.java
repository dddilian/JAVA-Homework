//�� �� �������� 2 ����� �� ������������ � � �.
//�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
//�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
//������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//������������) ����� ��-������ �� 200, �� �� �������� �����������.

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number a: ");
		int a = sc.nextInt();
		System.out.print("Enter number b: ");
		int b = sc.nextInt();

		int biggest;
		int powered;
		int sum = 0;

		if (a > b) {
			biggest = a;
			a = b;
			b = biggest;

		} else {

			for (int i = a; i <= b; i++) {
				if (i % 3 == 0) {
					System.out.print("Skip " + i + ", ");
					continue;

				} else {
					powered = i * i;
					sum = sum + powered;
					System.out.print(powered + ", ");

					if (sum > 200) {
						break;
					}
					// System.out.print(powered + ", ");
				}
			}
			System.out.println("Sum is: " + sum);
		}
		sc.close();
	}
}