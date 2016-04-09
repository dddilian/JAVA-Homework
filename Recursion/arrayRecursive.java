import java.util.Arrays;
import java.util.Scanner;

public class arrayRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������� �� ������

		int[] array = new int[n]; // ����� ����� �� �������

		arrayLoop(array); // �������� �� ������ ����� ����� array
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}

	static void arrayFillRecursive(int[] masiv, int i) { //���������� ����� �� ������� �� ����� � �������� ��� ��������, ����� �� ���������� ������
		if (i == masiv.length) {
			return;
		}
		masiv[i] = i;
		arrayFillRecursive(masiv, i + 1);
	}

	static int[] arrayLoop(int[] masiv) { // ����� �� ������� �� �������� �� ����� ��� �������� ��������� �� ������

		for (int i = 0; i < masiv.length; i++) {
			masiv[i] = i;
		}
		return masiv;
	}
}