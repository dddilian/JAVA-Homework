
public class simpleRecursion {

	public static void main(String[] args) {

		print(10);

	}

	public static void print(int number) {
		if (number > 0) {

			number--;

			// System.out.println(number); //������ ����� ����� �� �� ������
			// ������ ������

			print(number);

			System.out.println(number); // ���������

		} else {
			return;
		}
	}

}