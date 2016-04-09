
//������ � �������� ����� �����.
//��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
//���, ���.
//��������� �� ���� �� ������� �: ������, ����, ����, ����.
//�� �� ������� ��������, ���� ����� �� ������� N - ����� ��
//��������� [1..51] � �� �������� ��������� ����� ����� �
//���������� ��-������ ����� �� �������.
//������: 47.
//�����: ��� ����, ��� ����, ��� ������, ��� ����, ��� ����, ���
//����

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int card = n; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			
			switch (cardNumber) {
			
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("������");
				break;
			case 3:
				System.out.print("��������");
				break;
			case 4:
				System.out.print("������");
				break;
			case 5:
				System.out.print("�������");
				break;
			case 6:
				System.out.print("�������");
				break;
			case 7:
				System.out.print("������");
				break;
			case 8:
				System.out.print("�������");
				break;
			case 9:
				System.out.print("�������");
				break;
			case 10:
				System.out.print("����");
				break;
			case 11:
				System.out.print("����");
				break;
			case 12:
				System.out.print("���");
				break;
			case 13:
				System.out.print("���");
				break;
			}
			
			System.out.print(" ");
			
			switch (cardSuit) {
			
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("����");
				break;
			case 3:
				System.out.print("����");
				break;
			case 0:
				System.out.print("����");
				break;
			}
			if (card < 52) {
				System.out.print(", ");
			}
			System.out.println();
		}
		sc.close();
	}
}