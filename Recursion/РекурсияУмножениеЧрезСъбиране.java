import java.util.Scanner;

public class ����������������������������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Enter power: ");
		int m = sc.nextInt();

		int result1 = recMultiAdd(n, m);
		System.out.println(result1);
		
		int result2 = powerRecursively(n, m);
		System.out.println(result2);
		sc.close();

	}

	public static int recMultiAdd(int num, int pow) { // ���������� �����,����� �������� ���� ����� �� �����
		                                              // ��� � ����� ���� - ������ �� ��� ���� ��, m ���� ����

		if (num == 0 || pow == 0) { // �������� �� ���� �� ����������
									// 0 �� ����� ����� � 0
			return 0;			    // � ����� ����� �������� �� 1 ���� ���� ��
		}
		
		if (pow == 1) {
			return num;
		}
		return num + recMultiAdd(num, pow - 1);
	}
	
	static int powerRecursively(int num, int power) { // ���������� ����� �� ��������� ���� ��������
		
		if (power == 0) {   // ���� �� ���������� - �� ������� 0 � 1 ����� ��������
		return 1;
		}
		if (power == 1) {
		return num;
		}
		
		return num + powerRecursively(num, power - 1); // � ���������� ������ ������ ������, �� �� ��������� �������,
		                                               // �������� �� ������ � 1 ��-�����, � ���������� ������� �� ���� ��������
		}
}