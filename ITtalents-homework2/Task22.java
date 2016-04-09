import java.util.Scanner;

//�� �� ������� ��������, ����� ������� ������� 10 ���-�����
//�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
//�������� ���������� �����.
//������� �� ��������, ������ � ������ ������� �����.
//������ �����: ����� �� ��������� [1..999]
//������: 1
//�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
//����������� ����� while.

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value between 1 and 999: ");
		int x = sc.nextInt();

		while (x < 1 || x > 999) {

			System.out.println("Out of range. Enter again: ");
			x = sc.nextInt();
		}

		int counter = 0;

		while (counter < 10) {
			if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
				counter++;
				System.out.print(counter + ":" + x + "; ");
			}
			x++;
		}
		sc.close();
	}
}