//�� �� ������� ��������, ���� ����� �� ������� ������� ��
//�����. ������ �� ���������� �� ���������� ��� ��� ����� ��
//����� �� 45.

public class Task20 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j <= 9; j++) {
				if (i + j > 9) {
					System.out.print((i + j - 10) + " ");
					continue;
				}

				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
	}
}