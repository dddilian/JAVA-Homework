//�� �� ������� ��������, ����� ���� ����� while �������
//��������� �� ���������, �� ��� ����������.
//�.�. ��� � �������� 4*5 �� �� ������� 5*4.

public class Task23 {

	public static void main(String[] args) {
		int counter = 1;
		int a = 1;
		int result = 1;

		while (counter <= 9) {

			while (a <= 9) {
				result = counter * a;
				System.out.print(counter + "*" + a + "=" + result + "; ");
				a++;
			}
			
			System.out.println();
			counter++;
			a = 1;
		}
	}
}