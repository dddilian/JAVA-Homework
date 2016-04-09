//�� �� ������� ��������, ���� ����� �� ��������
//���������� ����� �� ��������� [10..99] �� ������� ��������
//�����, ��� �������� �� �������� ����������:
//1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
//2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
//����������� ���������� ������ �� �� ������ �������� 1.

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value: ");
		int result = sc.nextInt();

		while (result < 10 || result > 99) {

			System.out.println("Out of range. Enter again: ");
			result = sc.nextInt();
		}

		while (result != 1) {
			if ((result - 1) % 2 != 0) {
				result = result / 2;

			} else if ((result - 1) % 2 == 0) {
				result = (result * 3) + 1;
			}
			System.out.print(result + " ");
		}
		sc.close();
	}
}