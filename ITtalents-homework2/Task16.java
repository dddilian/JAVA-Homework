import java.util.Scanner;

//�� �� ������� ��������, ���� ����� �� �������� 2 ����������
//����� N, M �� ��������� [10..5555].
//����������, ���� ����� for, �� ������� ������ ����� ��
//���������, ����� �� ������ �� 50 � �������� ���.
//������: 25,249
//�����: 200,150,100, 50.

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int m;

		do {
			System.out.println("Enter a: ");
			n = sc.nextInt();

			System.out.println("Enter b: ");
			m = sc.nextInt();

			if ((n < 10 || n > 5555) || (m < 10 || m > 5555)) {
				System.out.println("A numer isn't in the desired interval, try again: ");
			}
		} while ((n < 10 || n > 5555) || (m < 10 || m > 5555));

		int biggest;

		if (n > m) {

			biggest = n;
			n = m;
			m = biggest;
		}

		for (int i = m; i > n; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}